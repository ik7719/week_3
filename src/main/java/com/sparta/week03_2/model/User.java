package com.sparta.week03_2.model;

import com.sparta.week03_2.dto.UserRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class User extends Timestamped {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String password;

    @Column(nullable = false)
    private String titles;

    @Column(nullable = false)
    private String writer;

    public User(UserRequestDto requestDto) {
        this.writer = requestDto.getWriter();
        this.titles = requestDto.getTitles();
    }

    public void update(UserRequestDto requestDto) {
        this.writer = requestDto.getWriter();
        this.titles = requestDto.getTitles();
        this.password = requestDto.getPassword();
    }

    public void delete(UserRequestDto requestDto) {
        this.password = requestDto.getPassword();
    }
}