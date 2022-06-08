package com.woowahanstudy.schoolvery.chat.persistence;

import com.woowahanstudy.schoolvery.chat.application.port.out.AddChatRoomPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Repository
@Transactional(readOnly = true)
public class ChatRoomPersistenceAdapter implements AddChatRoomPort {

    private final ChatRoomJpaRepository chatroomJpaRepository;

    @Override
    public void add(ChatRoomEntity chatroomEntity) {

        chatroomJpaRepository.save(chatroomEntity);
    }
}
