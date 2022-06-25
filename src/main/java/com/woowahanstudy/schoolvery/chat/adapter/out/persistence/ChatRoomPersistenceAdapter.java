package com.woowahanstudy.schoolvery.chat.adapter.out.persistence;

import com.woowahanstudy.schoolvery.chat.application.port.out.RegisterChatRoomPort;
import com.woowahanstudy.schoolvery.chat.domain.ChatRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class ChatRoomPersistenceAdapter implements RegisterChatRoomPort {

    private final ChatRoomJpaRepository chatroomJpaRepository;

    @Override
    public Long add(ChatRoom chatRoom) {

        ChatRoomEntity chatRoomEntity = new ChatRoomEntity();
        chatRoomEntity.setBoardId(chatRoom.getBoardId());
        chatroomJpaRepository.save(chatRoomEntity);
        return chatRoomEntity.getId();
    }
}
