package com.woowahanstudy.schoolvery.chat.adapter.out.persistence;

import com.woowahanstudy.schoolvery.chat.domain.ChatRoom;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChatRoomConverter {
    ChatRoomConverter INSTANCE = Mappers.getMapper(
        ChatRoomConverter.class);

    ChatRoomEntity chatRoomToChatRoomEntity(final ChatRoom chatRoom);
}
