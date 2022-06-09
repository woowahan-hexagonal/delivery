package com.woowahanstudy.schoolvery.board.application.service.dto.request;

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
public class AddBoardDto {

    private String title;

    @Enumerated(EnumType.STRING)
    private BoardCategory boardCategory;
}
