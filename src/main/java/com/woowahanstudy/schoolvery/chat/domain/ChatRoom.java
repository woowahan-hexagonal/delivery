package com.woowahanstudy.schoolvery.chat.domain;

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
    @Setter
    private Long boardId;
}
