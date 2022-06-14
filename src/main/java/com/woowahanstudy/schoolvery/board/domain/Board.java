package com.woowahanstudy.schoolvery.board.domain;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
public class Board {

    private Long id;
    private String title;
    private BoardCategory boardCategory;
}
