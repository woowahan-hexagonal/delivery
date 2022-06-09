package com.woowahanstudy.schoolvery.board.web;

import com.woowahanstudy.schoolvery.board.application.port.in.AddBoardUseCase;
import com.woowahanstudy.schoolvery.board.application.service.dto.request.AddBoardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class AddBoardController {

    private final AddBoardUseCase addBoardUseCase;

    @PostMapping(path = "/boards")
    public ResponseEntity<Void> addBoard(@RequestBody @Valid AddBoardDto addBoardDto) {

        addBoardUseCase.addBoard(addBoardDto);

        return ResponseEntity.status(HttpStatus.CREATED)
                .build();
    }
}
