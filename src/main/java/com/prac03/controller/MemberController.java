package com.prac03.controller;

import com.prac03.domain.Member;
import com.prac03.domain.MemberDto;
import com.prac03.domain.MemberRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Getter
@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberDto memberDto;

    private final MemberRepository memberRepository;
    // final 선언하려면 @RequiredArgsConstructor 필요해.


    @PostMapping("/api")
    public String PostMember(@RequestBody MemberDto memberDto){
        Member member = new Member();
        memberRepository.save(member);
        // JpaRepository 매개변수 확인, 인터페이스 명 일치 확인

        // 무엇을 리턴해야 할까? // 어디에?
        return memberDto.getTitle();
    }
}
