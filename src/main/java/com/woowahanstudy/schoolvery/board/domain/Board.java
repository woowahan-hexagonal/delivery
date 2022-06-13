package com.woowahanstudy.schoolvery.board.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Board {

    @Getter
    private Long id;


    @Getter
    private String title;

    @Getter
    private BoardCategory boardCategory;

    // final 다 지워줌

//    @Enumerated(EnumType.STRING)
//    @ColumnDefault("'OPEN'")
//    private BoardStatus boardStatus;
//
//    @OneToOne(mappedBy = "board")
//    private ChatRoomEntity chatroom;

//    @Value
//    public static class BoardId {
//        private Long value;
//    }
}
