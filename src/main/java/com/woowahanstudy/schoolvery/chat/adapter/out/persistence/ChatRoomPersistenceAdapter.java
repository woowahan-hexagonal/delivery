package com.woowahanstudy.schoolvery.chat.adapter.out.persistence;

import com.woowahanstudy.schoolvery.board.adapter.out.persistence.BoardEntity;
import com.woowahanstudy.schoolvery.board.adapter.out.persistence.BoardPersistenceAdapter;
import com.woowahanstudy.schoolvery.chat.application.port.out.RegisterChatRoomPort;
import com.woowahanstudy.schoolvery.chat.domain.ChatRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class ChatRoomPersistenceAdapter implements RegisterChatRoomPort {

    private final ChatRoomJpaRepository chatroomJpaRepository;
    private final BoardPersistenceAdapter boardPersistenceAdapter;

    @Override
    public Long add(ChatRoom chatRoom) {

        ChatRoomEntity chatRoomEntity = new ChatRoomEntity();

        BoardEntity boardEntity = boardPersistenceAdapter.findById(chatRoom.getBoardId());
        boardEntity.setChatRoom(chatRoomEntity);

        chatRoomEntity.setBoardEntity(boardEntity);
        chatroomJpaRepository.save(chatRoomEntity);
        return chatRoomEntity.getId();
    }
}
