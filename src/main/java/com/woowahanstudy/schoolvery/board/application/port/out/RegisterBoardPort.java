package com.woowahanstudy.schoolvery.board.application.port.out;

import com.woowahanstudy.schoolvery.board.domain.Board;

public interface RegisterBoardPort {

    Long add(final Board board);
}
