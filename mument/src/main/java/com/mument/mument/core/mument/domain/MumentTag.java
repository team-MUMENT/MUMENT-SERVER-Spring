package com.mument.mument.core.mument.domain;

import com.mument.mument.core.common.domain.BaseDate;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class MumentTag extends BaseDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mument_id", nullable = false)
    private Mument mument;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id", nullable = false)
    private Tag tag;

    @Column(nullable = false, name = "is_deleted")
    private boolean is_deleted;

    private LocalDateTime updatedAt;
}
