package com.sparta.homework.week03;

import com.sparta.homework.week03.domain.Model;
import com.sparta.homework.week03.domain.ModelRepository;
import com.sparta.homework.week03.models.ModelRequestDto;
import com.sparta.homework.week03.service.ModelService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Week03Application {

    public static void main(String[] args) {
        SpringApplication.run(Week03Application.class, args);

    }
}
