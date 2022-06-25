package com.woowahanstudy.schoolvery.board.adapter.in.web;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.woowahanstudy.schoolvery.board.application.port.in.RegisterBoardServicePort;
import com.woowahanstudy.schoolvery.board.application.port.in.dto.RegisterBoardRequestDto;
import com.woowahanstudy.schoolvery.board.domain.BoardCategory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.then;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class RegisterBoardControllerTest {

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RegisterBoardServicePort registerBoardServicePort;

    @DisplayName("게시글 등록 테스트")
    @Test
    void 게시글_등록_컨트롤러() throws  Exception {

        String body = mapper.writeValueAsString(
            RegisterBoardRequestDto.builder().id(1L).title("title").boardCategory(BoardCategory.Desert).build()
        );

        mockMvc.perform(post("/boards")
            .content(body)
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isCreated())
            .andDo(print());

        then(registerBoardServicePort).should()
            .addBoard(eq(new RegisterBoardRequestDto(1L, "title", BoardCategory.Desert)));

    }
}