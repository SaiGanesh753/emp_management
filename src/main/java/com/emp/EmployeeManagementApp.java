package com.emp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackages = {"com.emp.model"})
public class EmployeeManagementApp {

    public static Logger log = LogManager.getLogger(EmployeeManagementApp.class);
    public static void main(String[] args) {
        log.info("Application initialization...");
        SpringApplication.run(EmployeeManagementApp.class, args);
    }

}
