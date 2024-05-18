package com.superdev.lojinha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.superdev.lojinha.controller")
public class LojinhaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LojinhaApplication.class, args);
    }

}
