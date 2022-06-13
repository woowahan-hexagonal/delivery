package com.woowahanstudy.schoolvery.board.application.port.in.converter;

import com.woowahanstudy.schoolvery.board.adapter.out.persistence.BoardEntity;
import com.woowahanstudy.schoolvery.board.application.port.in.dto.RegisterBoardRequestDto;
import com.woowahanstudy.schoolvery.board.domain.Board;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RegisterBoardRequestDtoConverter {
    RegisterBoardRequestDtoConverter INSTANCE =
        Mappers.getMapper(RegisterBoardRequestDtoConverter.class);

    Board registerBoardRequestDtoToBoard(final RegisterBoardRequestDto registerBoardRequestDto);
}
