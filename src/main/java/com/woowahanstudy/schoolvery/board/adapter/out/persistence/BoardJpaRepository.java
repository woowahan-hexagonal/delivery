package com.woowahanstudy.schoolvery.board.adapter.out.persistence;

import com.woowahanstudy.schoolvery.board.persistence.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface BoardJpaRepository extends JpaRepository<BoardEntity, Long> {
}
