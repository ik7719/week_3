package com.sparta.week03_2.controller;

import com.sparta.week03_2.domain.Memo;
import com.sparta.week03_2.domain.MemoRepository;
import com.sparta.week03_2.domain.MemoRequestDto;
import com.sparta.week03_2.service.MemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@RestController
public class MemoController {

    private final MemoRepository memoRepository;
    private final MemoService memoService;

    @PostMapping("/api/post")
    public Memo createMemo(@RequestBody MemoRequestDto requestDto) {
        Memo memo = new Memo(requestDto); // 저장하는 것은 Dto가 아니라 Memo이니, Dto의 정보를 memo에 담아야 합니다.
        return memoRepository.save(memo); // JPA를 이용하여 DB에 저장하고, 그 결과를 반환합니다.
    }

    @GetMapping("/api/read")
    public List<Memo> getMemos() {
        return memoRepository.findAllByOrderByModifiedAtDesc();
    }

    @GetMapping("/api/read/{id}")
    public Optional<Memo> getOne(@PathVariable Long id) {
        return memoRepository.findById(id);
    }

    @PutMapping("/api/modify/{id}")
    public Long updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto) {
        memoService.update(id, requestDto);
        return id;
    }

    @DeleteMapping("/api/delete/{id}")
    public Long deleteMemo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto) {
        memoService.delete(id, requestDto);
        return id;
    }
}