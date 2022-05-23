package com.sparta.homework.week03.domain;

import com.sparta.homework.week03.models.ModelRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor // 기본 생성자 생략
public class Model {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    private Long Id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String writer;
    @Column(nullable = false)
    private int days; // 작성날짜는 고민해봐

    public Model(ModelRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.writer = requestDto.getWriter();
        this.days = requestDto.getDays();
    }

    public void update(ModelRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.writer = requestDto.getWriter();
        this.days = requestDto.getDays();
    }
}
