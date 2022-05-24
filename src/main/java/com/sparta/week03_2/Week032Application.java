package com.sparta.week03_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Week032Application {

    public static void main(String[] args) {
        SpringApplication.run(Week032Application.class, args);
    }

}
