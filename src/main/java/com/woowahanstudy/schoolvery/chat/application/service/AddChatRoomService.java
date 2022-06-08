package com.woowahanstudy.schoolvery.chat.application.service;

import com.woowahanstudy.schoolvery.chat.application.port.in.AddChatRoomUseCase;
import com.woowahanstudy.schoolvery.chat.application.port.out.AddChatRoomPort;
import com.woowahanstudy.schoolvery.chat.application.service.converter.ChatRoomConverter;
import com.woowahanstudy.schoolvery.chat.application.service.dto.AddChatRoomDto;
import com.woowahanstudy.schoolvery.chat.persistence.ChatRoomEntity;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class AddChatRoomService implements AddChatRoomUseCase {

    private final AddChatRoomPort addChatRoomPort;

    @Override
    public void addChatRoom(AddChatRoomDto addChatRoomDto) {


        final ChatRoomEntity chatRoomEntity = ChatRoomConverter.INSTANCE.createChatRoomDtoToChatRoomEntity(
            addChatRoomDto);
        addChatRoomPort.add(chatRoomEntity);

    }
}
