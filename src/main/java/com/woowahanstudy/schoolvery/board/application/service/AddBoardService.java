package com.woowahanstudy.schoolvery.board.application.service;

import com.woowahanstudy.schoolvery.board.application.port.in.AddBoardUseCase;
import com.woowahanstudy.schoolvery.board.application.port.out.AddBoardPort;
import com.woowahanstudy.schoolvery.board.application.service.dto.request.AddBoardDto;
import com.woowahanstudy.schoolvery.board.application.service.converter.BoardConverter;
import com.woowahanstudy.schoolvery.board.persistence.BoardEntity;
import com.woowahanstudy.schoolvery.chat.application.port.in.AddChatRoomUseCase;
import com.woowahanstudy.schoolvery.chat.application.service.dto.AddChatRoomDto;
import com.woowahanstudy.schoolvery.chat.persistence.ChatRoomEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class AddBoardService implements AddBoardUseCase {
    private final AddBoardPort addBoardPort;
    private final AddChatRoomUseCase addChatRoomUseCase;

    @Override
    public void addBoard(AddBoardDto addBoardDto) {

        final BoardEntity boardEntity = BoardConverter.INSTANCE.createBoardDtoToBoardEntity(
            addBoardDto);
        addBoardPort.add(boardEntity);

        final AddChatRoomDto addChatRoomDto = new AddChatRoomDto();
        addChatRoomDto.setBoard(boardEntity);
        addChatRoomUseCase.addChatRoom(addChatRoomDto);
    }
}
