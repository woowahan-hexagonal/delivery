package com.woowahanstudy.schoolvery.board.adapter.out.persistence;

import com.woowahanstudy.schoolvery.board.domain.Board;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BoardConverter {

    BoardConverter INSTANCE =
        Mappers.getMapper(BoardConverter.class);

    BoardEntity boardToBoardEntity(final Board board);

    Board boardEntityToBoard(final BoardEntity boardEntity);
}
