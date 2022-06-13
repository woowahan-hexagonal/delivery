package com.woowahanstudy.schoolvery.board.adapter.out.persistence;

import com.woowahanstudy.schoolvery.board.application.port.in.converter.RegisterBoardRequestDtoConverter;
import com.woowahanstudy.schoolvery.board.application.port.out.RegisterBoardPort;
import com.woowahanstudy.schoolvery.board.domain.Board;
//import com.woowahanstudy.schoolvery.board.domain.Board.BoardId;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Repository
public class BoardPersistenceAdapter implements RegisterBoardPort {

    private final BoardJpaRepository boardJpaRepository;

    @Override
    public Long add(Board board) {
//        final Board board = RegisterBoardRequestDtoConverter.INSTANCE
//            .registerBoardRequestDtoToBoard(registerBoardRequestDto);
        final BoardEntity boardEntity =
            BoardToBoardEntityConverter.INSTANCE.boardToBoardEntity(board);
        boardJpaRepository.save(boardEntity);
        return board.getId();
    }
}
