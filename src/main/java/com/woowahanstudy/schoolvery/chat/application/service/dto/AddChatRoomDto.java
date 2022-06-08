package com.woowahanstudy.schoolvery.chat.application.service.dto;

import com.woowahanstudy.schoolvery.board.persistence.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddChatRoomDto {

    private BoardEntity board;
}
