package com.sparta.week03_2.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Memo extends Timestamped {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String password;

    @Column(nullable = false)
    private String titles;

    @Column(nullable = false)
    private String writer;

    public Memo(MemoRequestDto requestDto) {
        this.writer = requestDto.getWriter();
        this.titles = requestDto.getTitles();
    }

    public void update(MemoRequestDto requestDto) {
        this.writer = requestDto.getWriter();
        this.titles = requestDto.getTitles();
        this.password = requestDto.getPassword();
    }

    public void delete(MemoRequestDto requestDto) {
        this.password = requestDto.getPassword();
    }
}