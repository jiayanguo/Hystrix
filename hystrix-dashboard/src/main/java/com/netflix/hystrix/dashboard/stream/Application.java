package com.netflix.hystrix.dashboard.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jguo on 1/23/17.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        System.out.println("===================server started at:====================");
        System.out.println("http://localhost:8080");
    }
}
