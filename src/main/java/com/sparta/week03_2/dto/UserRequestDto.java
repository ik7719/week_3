package com.sparta.week03_2.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class UserRequestDto
{
    private Long id;
    private String writer;
    private String titles;
    private String comment;

    private String username;
    private String password;
    private String samePassword;
}
