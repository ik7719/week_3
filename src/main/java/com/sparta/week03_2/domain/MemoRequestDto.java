package com.sparta.week03_2.domain;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class MemoRequestDto {

    private String writer;
    private String titles;
    private String password;
    private Long id;
//    private String comment;;

}
