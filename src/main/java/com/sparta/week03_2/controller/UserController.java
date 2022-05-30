package com.sparta.week03_2.controller;

import com.sparta.week03_2.model.User;
import com.sparta.week03_2.repository.UserRepository;
import com.sparta.week03_2.dto.UserRequestDto;
import com.sparta.week03_2.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    @PostMapping("/api/signup")
    public User createMemo(@RequestBody UserRequestDto requestDto) {
        User user = new User(requestDto);
        return userRepository.save(user);
    }

    @GetMapping("/api")
    public List<User> getMemos() {
        return userRepository.findAllByOrderByModifiedAtDesc();
    }

    @GetMapping("/api/{id}")
    public Optional<User> getOne(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @PutMapping("/api/{id}")
    public Long updateMemo(@PathVariable Long id, @RequestBody UserRequestDto requestDto) {
        userService.update(id, requestDto);
        return id;
    }

    @DeleteMapping("/api/{id}")
    public Long deleteMemo(@PathVariable Long id, @RequestBody UserRequestDto requestDto) {
        userService.delete(id, requestDto);
        return id;
    }
}