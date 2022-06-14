package com.woowahanstudy.schoolvery.chat.adapter.out.persistence;

import com.woowahanstudy.schoolvery.board.adapter.out.persistence.BoardEntity;
import com.woowahanstudy.schoolvery.common.BaseEntity;
import java.util.Optional;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "chat_room")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatRoomEntity extends BaseEntity {

    @Setter
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "board_id", referencedColumnName = "id")
    private BoardEntity board;

    public void setBoardEntity(BoardEntity boardEntity) {
        this.board = boardEntity;
    }
}
