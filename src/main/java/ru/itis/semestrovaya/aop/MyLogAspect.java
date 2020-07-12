package ru.itis.semestrovaya.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import ru.itis.semestrovaya.dto.RegisterDto;
import ru.itis.semestrovaya.dto.ResultDto;

@Aspect
@Component
@Slf4j
public class MyLogAspect {

    @After(value = "execution(* ru.itis.semestrovaya.service.RegisterService.saveUser(*))")
    public void after(JoinPoint joinPoint) {
        log.info("User with email " + ((RegisterDto)joinPoint.getArgs()[0]).getEmail() + " registered");
    }

    @Around(value = "execution(* ru.itis.semestrovaya.service.CodeExecuteService.test(long, String))")
    public ResultDto around(ProceedingJoinPoint joinPoint) {
        long start = System.currentTimeMillis();
        Object[] args = joinPoint.getArgs();
        ResultDto resultDto;
        try {
            resultDto = (ResultDto) joinPoint.proceed(args);
        } catch (Throwable throwable) {
            throw new IllegalStateException(throwable);
        }
        System.out.println(resultDto.toString());
        resultDto.setTime(System.currentTimeMillis() - start);
        System.out.println(resultDto.toString());
        return resultDto;
    }
}
