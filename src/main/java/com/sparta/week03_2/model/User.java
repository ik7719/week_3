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

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String comment;

    private String password;

    private String samePassword;

    private String regExp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])";

    @Column(nullable = false)
    private String titles;

    @Column(nullable = false)
    private String writer;

    public User(UserRequestDto userRequestDto) {
        this.password = userRequestDto.getPassword();
        this.samePassword = userRequestDto.getSamePassword();
    }

    public void create(UserRequestDto userRequestDto)
    {
        this.password = userRequestDto.getPassword();
        this.samePassword = userRequestDto.getSamePassword();
    }

    public void update(UserRequestDto userRequestDto) {
        this.writer = userRequestDto.getWriter();
        this.titles = userRequestDto.getTitles();
        this.password = userRequestDto.getPassword();
    }

    public void delete(UserRequestDto userRequestDto) {
        this.password = userRequestDto.getPassword();
    }
}