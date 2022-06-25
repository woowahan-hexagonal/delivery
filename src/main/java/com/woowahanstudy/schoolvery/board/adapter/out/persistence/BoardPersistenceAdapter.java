package com.woowahanstudy.schoolvery.board.adapter.out.persistence;

import com.woowahanstudy.schoolvery.board.application.port.out.LoadBoardPort;
import com.woowahanstudy.schoolvery.board.application.port.out.RegisterBoardPort;
import com.woowahanstudy.schoolvery.board.domain.Board;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
@Transactional(readOnly = true)
public class BoardPersistenceAdapter implements RegisterBoardPort, LoadBoardPort {

    private final BoardJpaRepository boardJpaRepository;

    @Override
    @Transactional
    public Long add(final Board board) {

        final BoardEntity boardEntity =
            BoardConverter.INSTANCE.boardToBoardEntity(board);
        return boardJpaRepository.save(boardEntity).getId();
    }

    @Override
    @Transactional
    public Board findById(final Long boardId) {
        return BoardConverter.INSTANCE.boardEntityToBoard(boardJpaRepository.findById(boardId)
            .orElseThrow(() -> new IllegalArgumentException("no such data")));
    }
}
