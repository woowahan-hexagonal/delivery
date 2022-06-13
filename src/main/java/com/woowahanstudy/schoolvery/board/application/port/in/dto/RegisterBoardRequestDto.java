package com.woowahanstudy.schoolvery.board.application.port.in.dto;

import com.woowahanstudy.schoolvery.board.domain.BoardCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterBoardRequestDto {

    private String title;

    @Enumerated(EnumType.STRING)
    private BoardCategory boardCategory;
}
