package com.sparta.homework.week03.domain;
import com.sparta.homework.week03.models.ModelRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@Getter
public class Model {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int days;

    public Model(Long id, ModelRequestDto requestDto){
        this.name = requestDto.getName();
        this.days = requestDto.getDays();
    }
    public void update(ModelRequestDto requestDto){
        this.name = requestDto.getName();
        this.days = requestDto.getDays();
    }
}
