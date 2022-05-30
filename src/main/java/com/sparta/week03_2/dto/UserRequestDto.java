package com.sparta.week03_2.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class UserRequestDto
{
    private Long id;
    private String writer;
    private String titles;

    private String username;
    private String password;
    private String samePassword;
}
