package com.woowahanstudy.schoolvery.chat.adapter.out.persistence;

import com.woowahanstudy.schoolvery.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "chat_room")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatRoomEntity extends BaseEntity {

    @Column(name="board_id")
    private Long boardId;

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }
}
