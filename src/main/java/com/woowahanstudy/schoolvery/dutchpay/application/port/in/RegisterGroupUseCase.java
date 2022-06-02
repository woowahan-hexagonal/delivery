package com.woowahanstudy.schoolvery.dutchpay.application.port.in;

import com.woowahanstudy.schoolvery.dutchpay.application.service.dto.request.CreateBoardDto;

public interface RegisterGroupUseCase {

    void registerGroup(CreateBoardDto createBoardDto);

}
