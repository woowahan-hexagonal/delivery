package com.woowahanstudy.schoolvery.board.application.service;

import static org.junit.jupiter.api.Assertions.*;

import com.woowahanstudy.schoolvery.board.adapter.out.persistence.BoardPersistenceAdapter;
import com.woowahanstudy.schoolvery.board.application.port.in.dto.RegisterBoardRequestDto;
import com.woowahanstudy.schoolvery.board.domain.Board;
import com.woowahanstudy.schoolvery.board.domain.BoardCategory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RegisterBoardServiceTest {

    @Autowired
    private RegisterBoardService registerBoardService;

    @Autowired
    private BoardPersistenceAdapter boardPersistenceAdapter;

    @Test
    @DisplayName("새 게시글 작성")
    public void 새_게시글_작성_유스케이스() {

        // given
        Board board = new Board(1L, "title",
            BoardCategory.Desert);

        // when
        Long newBoardId = boardPersistenceAdapter.add(board);

        // then
        Board findBoard = boardPersistenceAdapter.findById(newBoardId);

        assertEquals(board.getTitle(), findBoard.getTitle());
        assertEquals(board.getBoardCategory(), findBoard.getBoardCategory());

    }

}