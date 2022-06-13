package com.woowahanstudy.schoolvery.chat.adapter.out.persistence;

import com.woowahanstudy.schoolvery.board.adapter.out.persistence.BoardEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "chat_room")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatRoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Setter
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "board_id", referencedColumnName = "id")
    private BoardEntity board;
}
