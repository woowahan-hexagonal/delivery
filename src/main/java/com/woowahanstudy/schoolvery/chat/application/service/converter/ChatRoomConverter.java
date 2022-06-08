package com.woowahanstudy.schoolvery.chat.application.service.converter;

import com.woowahanstudy.schoolvery.board.application.service.converter.BoardConverter;
import com.woowahanstudy.schoolvery.board.application.service.dto.request.AddBoardDto;
import com.woowahanstudy.schoolvery.board.persistence.BoardEntity;
import com.woowahanstudy.schoolvery.chat.application.service.dto.AddChatRoomDto;
import com.woowahanstudy.schoolvery.chat.persistence.ChatRoomEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChatRoomConverter {
    ChatRoomConverter INSTANCE = Mappers.getMapper(ChatRoomConverter.class);

    ChatRoomEntity createChatRoomDtoToChatRoomEntity(final AddChatRoomDto addChatRoomDto);
}
