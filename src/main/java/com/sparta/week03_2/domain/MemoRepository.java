package com.sparta.week03_2.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();
    // 다 찾아줘 / 정렬해줘 / 수정된 날짜 기준으로 / 최신순으로
}