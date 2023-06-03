package com.mument.mument.core.music.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String artist;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String name;
}
