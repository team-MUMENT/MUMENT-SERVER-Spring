package com.mument.mument.core.user.domain;

import com.mument.mument.core.common.domain.BaseDate;
import com.mument.mument.core.user.domain.User;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Block extends BaseDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "blocked_user_id", nullable = false)
    private User blockedUser;
}
