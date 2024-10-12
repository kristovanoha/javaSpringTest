//package com.hexar.springhibernate;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//}


package com.hexar.springhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHibernateHelloWorldApplication {

    public static void main(String[] args) {
        System.out.println("Start aplikace ");
        SpringApplication.run(SpringHibernateHelloWorldApplication.class, args);
    }
}
