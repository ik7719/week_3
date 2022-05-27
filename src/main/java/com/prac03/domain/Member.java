package com.prac03.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Member {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String writer;

    public Member(MemberResponseDto memberResponseDto) {
        this.title = memberResponseDto.getTitle();
        this.writer = memberResponseDto.getWriter();
    }

}
