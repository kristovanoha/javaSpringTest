package com.hexar.springhibernate.aspekt;

import com.hexar.springhibernate.model.Person;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.hexar.springhibernate.controller.PersonController.getAllPersons(..))")
    public void logAccessTime() {
        LocalDateTime accessTime = LocalDateTime.now();
        System.out.println("AOP Čas přístupu k metodě getAllPersons: " + accessTime);
    }

    @AfterReturning(pointcut = "execution(* com.hexar.springhibernate.controller.PersonController.getAllPersons(..))", returning = "result")
    public void logMethodReturn(List<Person> result) {
        LocalDateTime returnTime = LocalDateTime.now();
        System.out.println("DRUHA Čas návratu z metody getAllPersons: " + returnTime);
        System.out.println("DRUHA Návratová hodnota: " + result);
    }
}
