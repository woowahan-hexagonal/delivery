package com.woowahanstudy.schoolvery.dutchpay.application.service;

import com.woowahanstudy.schoolvery.dutchpay.application.port.in.RegisterGroupUseCase;
import com.woowahanstudy.schoolvery.dutchpay.application.port.out.SaveBoardPort;
import com.woowahanstudy.schoolvery.dutchpay.application.port.out.SaveChatroomPort;
import com.woowahanstudy.schoolvery.dutchpay.application.service.converter.BoardConverter;
import com.woowahanstudy.schoolvery.dutchpay.application.service.dto.request.CreateBoardDto;
import com.woowahanstudy.schoolvery.dutchpay.persistence.BoardEntity;
import com.woowahanstudy.schoolvery.dutchpay.persistence.ChatroomEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class RegisterGroupService implements RegisterGroupUseCase {
    private final SaveBoardPort saveBoardPort;
    private final SaveChatroomPort saveChatroomPort;

    @Override
    public void registerGroup(CreateBoardDto createBoardDto) {

        final BoardEntity boardEntity = BoardConverter.INSTANCE.createBoardDtoToBoardEntity(createBoardDto);
        final ChatroomEntity chatroomEntity = new ChatroomEntity();

        chatroomEntity.setBoard(boardEntity);
        saveBoardPort.add(boardEntity);
        saveChatroomPort.add(chatroomEntity);
    }
}
