package com.woowahanstudy.schoolvery.chat.adapter.out.persistence;

import com.woowahanstudy.schoolvery.chat.adapter.out.persistence.ChatRoomEntity.ChatRoomEntityBuilder;
import com.woowahanstudy.schoolvery.chat.domain.ChatRoom;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-15T14:35:30-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (AdoptOpenJDK)"
)
public class ChatRoomConverterImpl implements ChatRoomConverter {

    @Override
    public ChatRoomEntity chatRoomToChatRoomEntity(ChatRoom chatRoom) {
        if ( chatRoom == null ) {
            return null;
        }

        ChatRoomEntityBuilder chatRoomEntity = ChatRoomEntity.builder();

        chatRoomEntity.boardId( chatRoom.getBoardId() );

        return chatRoomEntity.build();
    }
}
