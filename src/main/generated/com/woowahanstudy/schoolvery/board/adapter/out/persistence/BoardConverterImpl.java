package com.woowahanstudy.schoolvery.board.adapter.out.persistence;

import com.woowahanstudy.schoolvery.board.adapter.out.persistence.BoardEntity.BoardEntityBuilder;
import com.woowahanstudy.schoolvery.board.domain.Board;
import com.woowahanstudy.schoolvery.board.domain.Board.BoardBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-15T14:35:30-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (AdoptOpenJDK)"
)
public class BoardConverterImpl implements BoardConverter {

    @Override
    public BoardEntity boardToBoardEntity(Board board) {
        if ( board == null ) {
            return null;
        }

        BoardEntityBuilder boardEntity = BoardEntity.builder();

        boardEntity.title( board.getTitle() );
        boardEntity.boardCategory( board.getBoardCategory() );

        return boardEntity.build();
    }

    @Override
    public Board boardEntityToBoard(BoardEntity boardEntity) {
        if ( boardEntity == null ) {
            return null;
        }

        BoardBuilder board = Board.builder();

        board.id( boardEntity.getId() );
        board.title( boardEntity.getTitle() );
        board.boardCategory( boardEntity.getBoardCategory() );

        return board.build();
    }
}
