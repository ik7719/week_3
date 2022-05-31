package com.sparta.week03_2.service;

import com.sparta.week03_2.model.User;
import com.sparta.week03_2.repository.UserRepository;
import com.sparta.week03_2.dto.UserRequestDto;
import lombok.Data;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;



@Data
@Service
public class UserService {

    private final UserRepository userRepository;

    User user = new User();

    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }




//    public void signupPassword()
//    {
//        if(! user.getPassword().equals( user.getSamePassword() )
//                || user.getPassword().matches(user.getUsername()) )
//            {
//                user.update(userRequestDto);
//            }
//    }

//    public Long signup(Long id, UserRequestDto userRequestDto)
//    {
//        User user = new User();
//        if (user.getUsername().matches(userRequestDto.getUsername()))
//        {
//            if( user.getPassword().equals( userRequestDto.getPassword() ) )
//            {
//                user.update(userRequestDto);
//            } else {
//                return id;
//            }
//        }
//        return user.getId();
//    }

//    @Transactional
//    public Long update(Long id, UserRequestDto userRequestDto)
//    {
//        User user = userRepository.findById(id).orElseThrow(
//                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
//        );
//        if( user.getPassword().equals( userRequestDto.getPassword() ) )
//        {
//            user.update(userRequestDto);
//            return user.getId();
//        } else {
//            return id;
//        }
//    }
//
//    @Transactional
//    public boolean delete(Long id, UserRequestDto requestDto) {
//        User user = userRepository.findById(id).orElseThrow(
//                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
//        );
//        if( user.getPassword().equals( requestDto.getPassword() ) ){
//            user.delete(requestDto);
//            userRepository.deleteById(id);
//            return true;
//        } else {
//            return false;
//        }
//    }
}