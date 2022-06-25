package com.woowahanstudy.schoolvery.chat.application.port.out;

import com.woowahanstudy.schoolvery.chat.domain.ChatRoom;

public interface LoadChatRoomPort {
    ChatRoom findChatRoomBuBoardId(Long boardId);
}
