package com.woowahanstudy.schoolvery.board.application.port.in.dto;

import com.woowahanstudy.schoolvery.board.domain.BoardCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterBoardRequestDto {

    private Long id;
    private String title;
    private BoardCategory boardCategory;
}
