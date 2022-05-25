package com.sparta.week03_2.service;

import com.sparta.week03_2.domain.Memo;
import com.sparta.week03_2.domain.MemoRepository;
import com.sparta.week03_2.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class MemoService {

    private final MemoRepository memoRepository;

    @Transactional
    public Long update(Long id, MemoRequestDto requestDto) {
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        if( memo.getPassword().equals( requestDto.getPassword() ) ){
            memo.update(requestDto);
            return memo.getId();
        } else {
            return id;
        }
    }
}