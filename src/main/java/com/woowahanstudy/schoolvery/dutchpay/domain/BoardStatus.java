package com.woowahanstudy.schoolvery.dutchpay.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BoardStatus {
    OPEN, CLOSED, DELETED;
}
