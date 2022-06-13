package com.woowahanstudy.schoolvery.board.adapter.in.web;

import com.woowahanstudy.schoolvery.board.application.port.in.RegisterBoardServicePort;
import com.woowahanstudy.schoolvery.board.application.port.in.dto.RegisterBoardRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class RegisterBoardController {

    private final RegisterBoardServicePort registerBoardServicePort;

    @PostMapping(path = "/boards")
    public ResponseEntity<Void> addBoard(@RequestBody @Valid RegisterBoardRequestDto registerBoardRequestDto) {

        registerBoardServicePort.addBoard(registerBoardRequestDto);

        return ResponseEntity.status(HttpStatus.CREATED)
                .build();
    }
}
