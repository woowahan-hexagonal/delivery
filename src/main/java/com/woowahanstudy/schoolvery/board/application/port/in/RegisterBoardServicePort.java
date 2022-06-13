package com.woowahanstudy.schoolvery.board.application.port.in;

import com.woowahanstudy.schoolvery.board.application.port.in.dto.RegisterBoardRequestDto;

public interface RegisterBoardServicePort {

    void addBoard(RegisterBoardRequestDto registerBoardRequestDto);

}
