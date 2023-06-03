package com.mument.mument.core.mument.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int tagSort;

    @Column(length = 20)
    private String content;
}
