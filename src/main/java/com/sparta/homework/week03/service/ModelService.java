package com.sparta.homework.week03.service;

import com.sparta.homework.week03.domain.Model;
import com.sparta.homework.week03.domain.ModelRepository;
import com.sparta.homework.week03.models.ModelRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@RequiredArgsConstructor
@Service
public class ModelService {

    private final ModelRepository repository;

    @Transactional
    public Long update(ModelRequestDto requestDto){
        Model model = modelRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 없습니다.")
        );
        model.update(requestDto);
        return model.getId();
    }
}
