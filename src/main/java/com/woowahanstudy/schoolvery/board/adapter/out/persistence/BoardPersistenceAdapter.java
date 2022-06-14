package com.woowahanstudy.schoolvery.board.adapter.out.persistence;

import com.woowahanstudy.schoolvery.board.application.port.out.RegisterBoardPort;
import com.woowahanstudy.schoolvery.board.domain.Board;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
@Transactional(readOnly = true)
public class BoardPersistenceAdapter implements RegisterBoardPort {

    private final BoardJpaRepository boardJpaRepository;

    @Transactional
    public BoardEntity findById(Long boardId) {
        return boardJpaRepository.findById(boardId)
            .orElseThrow(() -> new IllegalArgumentException("no such data"));
    }

    @Override
    @Transactional
    public Long add(Board board) {

        final BoardEntity boardEntity =
            BoardToBoardEntityConverter.INSTANCE.boardToBoardEntity(board);
        return boardJpaRepository.save(boardEntity).getId();
    }
}
