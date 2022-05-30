package com.sparta.week03_2.service;

import com.sparta.week03_2.model.User;
import com.sparta.week03_2.repository.UserRepository;
import com.sparta.week03_2.dto.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public Long update(Long id, UserRequestDto requestDto) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        if( user.getPassword().equals( requestDto.getPassword() ) ){
            user.update(requestDto);
            return user.getId();
        } else {
            return id;
        }
    }

    @Transactional
    public boolean delete(Long id, UserRequestDto requestDto) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        if( user.getPassword().equals( requestDto.getPassword() ) ){
            user.delete(requestDto);
            userRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}