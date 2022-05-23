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
    private final ModelRepository modelRepository;

    @Transactional
    public Long update(Long id, ModelRequestDto requestDto){
        Model model = modelRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 id가 존재하지 않습니다.")
        );
        model.update(requestDto);
        return model.getId();
    }
}
