package com.prac03.controller;

import com.prac03.domain.Member;
import com.prac03.domain.MemberRepository;
import com.prac03.domain.MemberResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;
    // final 선언하려면 @RequiredArgsConstructor 필요해.


    @PostMapping("/api")
    public Member postMember(@RequestBody MemberResponseDto memberResponseDto){
        Member member = new Member(memberResponseDto);
        return memberRepository.save(member);
        // JpaRepository 매개변수 확인, 인터페이스 명 일치 확인

    }
}


