package com.woowahanstudy.schoolvery.chat.application.port.in.dto;

import com.woowahanstudy.schoolvery.board.adapter.out.persistence.BoardEntity;
import com.woowahanstudy.schoolvery.board.domain.Board;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterChatRoomRequestDto {

    private Board board;

}

