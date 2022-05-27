package com.prac03.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

//    List<Member> findAllByOrderByModifiedAtDesc(); // 왜 활성화가 안될까?

}
