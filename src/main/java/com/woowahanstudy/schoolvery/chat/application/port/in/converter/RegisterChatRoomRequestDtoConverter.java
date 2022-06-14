package com.woowahanstudy.schoolvery.chat.application.port.in.converter;

import com.woowahanstudy.schoolvery.chat.application.port.in.dto.RegisterChatRoomRequestDto;
import com.woowahanstudy.schoolvery.chat.domain.ChatRoom;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RegisterChatRoomRequestDtoConverter {

    RegisterChatRoomRequestDtoConverter INSTANCE =
        Mappers.getMapper(RegisterChatRoomRequestDtoConverter.class);

    ChatRoom registerChatRoomRequestDtoToChatRoom(final RegisterChatRoomRequestDto registerChatRoomRequestDto);
}
