package com.woowahanstudy.schoolvery.chat.application.port.out;

import com.woowahanstudy.schoolvery.chat.persistence.ChatRoomEntity;

public interface AddChatRoomPort {

    void add(final ChatRoomEntity chatroomEntity);
}
