package ru.itis.semestrovaya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EntityScan("ru.itis.semestrovaya.model")
public class SemestrovayaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SemestrovayaApplication.class, args);
        PasswordEncoder pe = new BCryptPasswordEncoder();
        System.out.println(pe.encode("HelloWorld"));
    }

}
