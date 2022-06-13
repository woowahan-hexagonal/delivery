package com.woowahanstudy.schoolvery.chat.adapter.out.persistence;

import com.woowahanstudy.schoolvery.chat.domain.ChatRoom;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChatRoomToCharRoomEntityConverter {
    ChatRoomToCharRoomEntityConverter INSTANCE = Mappers.getMapper(
        ChatRoomToCharRoomEntityConverter.class);

    ChatRoomEntity chatRoomToChatRoomEntity(final ChatRoom chatRoom);
}
