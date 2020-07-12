package ru.itis.semestrovaya.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;
import ru.itis.semestrovaya.scope.RequestUUIDGenerator;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

@Slf4j
//@Component
public class AnyRequestLogFilter extends GenericFilterBean {

    @Autowired
    RequestUUIDGenerator requestUUIDGenerator;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("Request with id " + requestUUIDGenerator.getId());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
