package com.woowahanstudy.schoolvery.chat.application.port.in.converter;

import com.woowahanstudy.schoolvery.chat.application.port.in.dto.RegisterChatRoomRequestDto;
import com.woowahanstudy.schoolvery.chat.domain.ChatRoom;
import com.woowahanstudy.schoolvery.chat.domain.ChatRoom.ChatRoomBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-15T14:35:30-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (AdoptOpenJDK)"
)
public class RegisterChatRoomRequestDtoConverterImpl implements RegisterChatRoomRequestDtoConverter {

    @Override
    public ChatRoom registerChatRoomRequestDtoToChatRoom(RegisterChatRoomRequestDto registerChatRoomRequestDto) {
        if ( registerChatRoomRequestDto == null ) {
            return null;
        }

        ChatRoomBuilder chatRoom = ChatRoom.builder();

        chatRoom.boardId( registerChatRoomRequestDto.getBoardId() );

        return chatRoom.build();
    }
}
