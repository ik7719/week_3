package com.sparta.week03_2.domain;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Getter
public class MemoRequestDto {

    private String writer;
    private String titles;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;


}
