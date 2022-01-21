package com.emp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.emp.model"})
public class EmployeeManagement {
    public static void main(String[] args) {
        System.out.println("Application initialization...");
        SpringApplication.run(EmployeeManagement.class, args);
    }

}
