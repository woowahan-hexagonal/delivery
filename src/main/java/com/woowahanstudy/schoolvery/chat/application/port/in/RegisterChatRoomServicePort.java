package com.woowahanstudy.schoolvery.chat.application.port.in;

import com.woowahanstudy.schoolvery.chat.application.port.in.dto.RegisterChatRoomRequestDto;

public interface RegisterChatRoomServicePort {

    Long addChatRoom(RegisterChatRoomRequestDto registerChatRoomRequestDto);
}
