package com.sparta.week03_2.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class UserRequestDto {

    private String writer;
    private String titles;
    private String password;
    private Long id;

}
