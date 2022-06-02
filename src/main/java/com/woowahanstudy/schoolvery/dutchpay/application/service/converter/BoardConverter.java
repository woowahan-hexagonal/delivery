package com.woowahanstudy.schoolvery.dutchpay.application.service.converter;

import com.woowahanstudy.schoolvery.dutchpay.application.service.dto.request.CreateBoardDto;
import com.woowahanstudy.schoolvery.dutchpay.persistence.BoardEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BoardConverter {
    BoardConverter INSTANCE = Mappers.getMapper(BoardConverter.class);

    BoardEntity createBoardDtoToBoardEntity(final CreateBoardDto createBoardDto);
}
