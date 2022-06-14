package com.woowahanstudy.schoolvery.board.application.service;

import com.woowahanstudy.schoolvery.board.application.port.in.RegisterBoardServicePort;
import com.woowahanstudy.schoolvery.board.application.port.in.converter.RegisterBoardRequestDtoConverter;
import com.woowahanstudy.schoolvery.board.application.port.out.RegisterBoardPort;
import com.woowahanstudy.schoolvery.board.application.port.in.dto.RegisterBoardRequestDto;
import com.woowahanstudy.schoolvery.board.domain.Board;
import com.woowahanstudy.schoolvery.chat.application.port.in.RegisterChatRoomServicePort;
import com.woowahanstudy.schoolvery.chat.application.port.in.dto.RegisterChatRoomRequestDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class RegisterBoardService implements RegisterBoardServicePort {

    private final RegisterBoardPort registerBoardPort;
    private final RegisterChatRoomServicePort registerChatRoomServicePort;

    @Override
    public void addBoard(RegisterBoardRequestDto registerBoardRequestDto) {

        final Board board = RegisterBoardRequestDtoConverter.INSTANCE
            .registerBoardRequestDtoToBoard(registerBoardRequestDto);
        final RegisterChatRoomRequestDto registerChatRoomRequestDto =
            new RegisterChatRoomRequestDto();

        Long boardId = registerBoardPort.add(board);
        registerChatRoomRequestDto.setBoardId(boardId);
        registerChatRoomServicePort.addChatRoom(registerChatRoomRequestDto);
    }
}
