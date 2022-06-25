package com.woowahanstudy.schoolvery.board.application.port.in.converter;

import com.woowahanstudy.schoolvery.board.application.port.in.dto.RegisterBoardRequestDto;
import com.woowahanstudy.schoolvery.board.domain.Board;
import com.woowahanstudy.schoolvery.board.domain.Board.BoardBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-15T14:35:29-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (AdoptOpenJDK)"
)
public class RegisterBoardRequestDtoConverterImpl implements RegisterBoardRequestDtoConverter {

    @Override
    public Board registerBoardRequestDtoToBoard(RegisterBoardRequestDto registerBoardRequestDto) {
        if ( registerBoardRequestDto == null ) {
            return null;
        }

        BoardBuilder board = Board.builder();

        board.id( registerBoardRequestDto.getId() );
        board.title( registerBoardRequestDto.getTitle() );
        board.boardCategory( registerBoardRequestDto.getBoardCategory() );

        return board.build();
    }
}
