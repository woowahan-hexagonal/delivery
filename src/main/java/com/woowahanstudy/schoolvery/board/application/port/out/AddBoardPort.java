package com.woowahanstudy.schoolvery.board.application.port.out;

import com.woowahanstudy.schoolvery.board.persistence.BoardEntity;

public interface AddBoardPort {

    void add(final BoardEntity boardEntity);
}
