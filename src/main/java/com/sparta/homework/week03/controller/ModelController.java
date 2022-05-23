package com.sparta.homework.week03.controller;

import com.sparta.homework.week03.domain.Model;
import com.sparta.homework.week03.domain.ModelRepository;
import com.sparta.homework.week03.models.ModelRequestDto;
import com.sparta.homework.week03.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ModelController {

    private final ModelService modelService;
    private final ModelRepository modelRepository;

    @GetMapping("/api/models")
    public List<Model> getModels(){
        return modelRepository.findAll();
    }

}
