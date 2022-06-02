package com.woowahanstudy.schoolvery.dutchpay.web;

import com.woowahanstudy.schoolvery.dutchpay.application.port.in.RegisterGroupUseCase;
import com.woowahanstudy.schoolvery.dutchpay.application.service.dto.request.CreateBoardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class RegisterGroupController {

    private final RegisterGroupUseCase registerGroupUseCase;

    @PostMapping(path = "/boards")
    public ResponseEntity<Void> registerRecruit(@RequestBody @Valid CreateBoardDto createBoardDto) {

        registerGroupUseCase.registerGroup(createBoardDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .build();
    }
}
