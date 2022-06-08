package com.woowahanstudy.schoolvery.board.application.service.converter;

import com.woowahanstudy.schoolvery.board.application.service.dto.request.AddBoardDto;
import com.woowahanstudy.schoolvery.board.persistence.BoardEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BoardConverter {
    BoardConverter INSTANCE = Mappers.getMapper(BoardConverter.class);

    BoardEntity createBoardDtoToBoardEntity(final AddBoardDto addBoardDto);
}
