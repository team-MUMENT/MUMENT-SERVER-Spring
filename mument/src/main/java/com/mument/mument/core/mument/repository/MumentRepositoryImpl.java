package com.mument.mument.core.mument.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MumentRepositoryImpl implements MumentRepositoryCustom {

    private final JPAQueryFactory queryFactory;
}
