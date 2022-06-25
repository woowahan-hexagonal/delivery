package com.woowahanstudy.schoolvery.chat.application.port.out;

import com.woowahanstudy.schoolvery.chat.domain.ChatRoom;

public interface RegisterChatRoomPort {

    Long add(final ChatRoom chatroom);
}
