package com.example.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
@EntityScan(basePackages = "com.example.infrastructure.model")
@EnableJpaRepositories("com.example.infrastructure.persistance")
public class ApplicationExample {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationExample.class, args);
    }
}