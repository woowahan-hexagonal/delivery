package com.woowahanstudy.schoolvery.board.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface BoardJpaRepository extends JpaRepository<BoardEntity, Long> {
}
