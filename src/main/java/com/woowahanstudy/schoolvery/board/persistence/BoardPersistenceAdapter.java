package com.woowahanstudy.schoolvery.board.persistence;

import com.woowahanstudy.schoolvery.board.application.port.out.AddBoardPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Repository
@Transactional(readOnly = true)
public class BoardPersistenceAdapter implements AddBoardPort {

    private final BoardJpaRepository boardJpaRepository;
    @Override
    public void add(BoardEntity boardEntity) {
        boardJpaRepository.save(boardEntity);
    }
}
