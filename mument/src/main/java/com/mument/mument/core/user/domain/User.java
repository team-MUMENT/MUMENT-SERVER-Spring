package com.mument.mument.core.user.domain;

import com.mument.mument.core.common.domain.BaseDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10)
    private String provider;

    @Column(length = 50)
    private String profileId;

    private String refreshToken;

    private String image;

    private LocalDateTime updatedAt;

    private String authenticationCode;

    private String gender;

    private String ageRange;

    private String email;

    @Column(nullable = false, name = "is_deleted")
    private boolean is_deleted;

    private String fcmToken;
}
