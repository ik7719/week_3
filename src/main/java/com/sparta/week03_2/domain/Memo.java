package com.sparta.week03_2.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor // 기본생성자를 만듭니다.
@Getter
@Entity // 테이블과 연계됨을 스프링에게 알려줍니다.
public class Memo extends Timestamped { // 생성,수정 시간을 자동으로 만들어줍니다.

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String password;

    @Column(nullable = false)
    private String titles;

    @Column(nullable = false)
    private String writer;

//    public Memo(String writer, String titles, String password) {
//        this.writer = writer;
//        this.titles = titles;
//        this.password = password;
//    }

    public Memo(MemoRequestDto requestDto) {
        this.writer = requestDto.getWriter();
        this.titles = requestDto.getTitles();
//        this.id = requestDto.getId();
//        this.password = requestDto.getPassword();
    }

    public void update(MemoRequestDto requestDto) { // Service에서 사용
        this.writer = requestDto.getWriter();
        this.titles = requestDto.getTitles();
        this.password = requestDto.getPassword();
    }

    public void delete(MemoRequestDto requestDto) { // Service에서 사용
        this.password = requestDto.getPassword();
    }
}