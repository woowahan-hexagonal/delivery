package com.woowahanstudy.schoolvery.board.adapter.out.persistence;

import com.woowahanstudy.schoolvery.board.domain.Board;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BoardToBoardEntityConverter {

    BoardToBoardEntityConverter INSTANCE =
        Mappers.getMapper(BoardToBoardEntityConverter.class);
    BoardEntity boardToBoardEntity(final Board board);
}
