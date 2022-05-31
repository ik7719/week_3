package com.sparta.week03_2.controller;

import com.sparta.week03_2.service.UserService;
import com.sparta.week03_2.model.User;
import com.sparta.week03_2.repository.UserRepository;
import com.sparta.week03_2.dto.UserRequestDto;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Controller
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    @GetMapping("/comments") // 댓글 목록 조회 API
    public List<User> getComments()
    {
        return userRepository.findAllByOrderByModifiedAtDesc();
    }



//    @Autowired
//    @PostMapping("/signup")
//    public User createUser(@RequestBody UserRequestDto userRequestDto) {
//        User user = new User(userRequestDto);
//        userService.signupPassword();
//
//        // 리포에 저장하기 전에 확인
//        return userRepository.save(user);
//    }

//    @GetMapping("/login")
//    public String loginPage()
//    {
//        return "redirect:/login-form.html";
//    }
//
//    @PostMapping("/login")
//    public String loginProcess
//            (
//                    @RequestParam String id,
//                    @RequestParam String password,
//                    Model model
//            )
//    {
//        if (id.equals(password))
//        {
//            model.addAttribute("loginId", id);
//        }
//        return "login-result";
//    }
//
//    @GetMapping("/api")
//    public List<User> getMemos()
//    {
//        return userRepository.findAllByOrderByModifiedAtDesc();
//    }
//
//    @GetMapping("/api/{id}")
//    public Optional<User> getOne(@PathVariable Long id)
//    {
//        return userRepository.findById(id);
//    }
//
//    @PutMapping("/api/{id}")
//    public Long updateMemo(@PathVariable Long id, @RequestBody UserRequestDto requestDto)
//    {
//        userService.update(id, requestDto);
//        return id;
//    }
//
//    @DeleteMapping("/api/{id}")
//    public Long deleteMemo(@PathVariable Long id, @RequestBody UserRequestDto requestDto)
//    {
//        userService.delete(id, requestDto);
//        return id;
//    }
}