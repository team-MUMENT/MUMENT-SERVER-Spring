package com.mument.mument.core.mument.repository;

import com.mument.mument.core.mument.domain.Mument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MumentRepository extends JpaRepository<Mument, Long>, MumentRepositoryCustom {
}
