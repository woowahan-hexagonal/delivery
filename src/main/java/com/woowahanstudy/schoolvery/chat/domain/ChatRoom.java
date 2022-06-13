package com.woowahanstudy.schoolvery.chat.domain;

//import com.woowahanstudy.schoolvery.board.adapter.out.persistence.BoardEntity;
import com.woowahanstudy.schoolvery.board.adapter.out.persistence.BoardEntity;
import com.woowahanstudy.schoolvery.board.domain.Board;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatRoom {

    @Getter
    private Long id;

    // TODO : BoardEntity 말고 그냥 Board로 하면 컨버터 어케됨
    @Setter
    private BoardEntity boardEntity;

}
