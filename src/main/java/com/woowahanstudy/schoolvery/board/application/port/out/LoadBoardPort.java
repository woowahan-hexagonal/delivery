package com.woowahanstudy.schoolvery.board.application.port.out;

import com.woowahanstudy.schoolvery.board.domain.Board;

public interface LoadBoardPort {
    Board findById(final Long boardId);
}
