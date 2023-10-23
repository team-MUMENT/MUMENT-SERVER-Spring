package com.mument.mument.core.mument.domain;

import com.mument.mument.core.common.domain.BaseDate;
import com.mument.mument.core.user.domain.User;
import com.mument.mument.core.music.domain.Music;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Mument extends BaseDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "music_id", nullable = false)
    private Music music;

    @Column(length = 1000)
    private String content;

    @Column(nullable = false, name = "is_first")
    private boolean is_first;

    @Column(nullable = false)
    private int likeCount;

    @Column(nullable = false, name = "is_deleted")
    private boolean is_deleted;

    @Column(nullable = false, name = "is_private")
    private boolean is_private;

    private LocalDateTime updatedAt;
}
