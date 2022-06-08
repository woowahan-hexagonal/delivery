package com.woowahanstudy.schoolvery.board.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BoardStatus {
    OPEN, CLOSED, DELETED;
}
