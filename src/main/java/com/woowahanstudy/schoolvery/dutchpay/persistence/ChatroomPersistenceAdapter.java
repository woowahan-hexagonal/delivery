package com.woowahanstudy.schoolvery.dutchpay.persistence;

import com.woowahanstudy.schoolvery.dutchpay.application.port.out.SaveChatroomPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Repository
@Transactional(readOnly = true)
public class ChatroomPersistenceAdapter implements SaveChatroomPort {

    private final ChatroomJpaRepository chatroomJpaRepository;

    @Override
    public void add(ChatroomEntity chatroomEntity) {

        chatroomJpaRepository.save(chatroomEntity);
    }
}
