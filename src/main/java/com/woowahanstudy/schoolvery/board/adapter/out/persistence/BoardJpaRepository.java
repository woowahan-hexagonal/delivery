package com.woowahanstudy.schoolvery.board.adapter.out.persistence;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

interface BoardJpaRepository extends JpaRepository<BoardEntity, Long> {
    Optional<BoardEntity> findById(Long boardId);
}
