package com.woowahanstudy.schoolvery.board.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface BoardJpaRepository extends JpaRepository<BoardEntity, Long> {
}
