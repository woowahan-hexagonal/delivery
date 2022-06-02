package com.woowahanstudy.schoolvery.dutchpay.application.port.out;

import com.woowahanstudy.schoolvery.dutchpay.persistence.BoardEntity;

public interface SaveBoardPort {
    void add(final BoardEntity boardEntity);
}
