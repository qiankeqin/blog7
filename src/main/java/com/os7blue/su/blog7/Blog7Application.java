package com.os7blue.su.blog7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Blog7Application {

    public static void main(String[] args) {
        SpringApplication.run(Blog7Application.class, args);
    }
}
