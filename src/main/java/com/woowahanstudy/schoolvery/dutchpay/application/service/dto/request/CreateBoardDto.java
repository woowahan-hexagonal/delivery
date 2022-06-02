package com.woowahanstudy.schoolvery.dutchpay.application.service.dto.request;

import com.woowahanstudy.schoolvery.dutchpay.domain.BoardCategory;
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
public class CreateBoardDto {

    private String title;

    @Enumerated(EnumType.STRING)
    private BoardCategory boardCategory;
}
