package com.woowahanstudy.schoolvery.dutchpay.application.port.out;

import com.woowahanstudy.schoolvery.dutchpay.persistence.ChatroomEntity;

public interface SaveChatroomPort {
    void add(final ChatroomEntity chatroomEntity);
}
