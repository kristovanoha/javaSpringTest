package com.hexar.springhibernate.aspekt;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.controller.YourControllerClass.getAllPersons(..))")
    public void logAccessTime() {
        LocalDateTime accessTime = LocalDateTime.now();
        System.out.println("Čas přístupu k metodě getAllPersons: " + accessTime);
    }
}
