package com.woowahanstudy.schoolvery.board.adapter.out.persistence;

import com.woowahanstudy.schoolvery.board.domain.Board;
import com.woowahanstudy.schoolvery.board.domain.BoardCategory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Import({BoardPersistenceAdapter.class})
class BoardPersistenceAdapterTest {

    @Autowired
    private BoardPersistenceAdapter boardPersistenceAdapter;

    @Autowired
    private BoardJpaRepository boardJpaRepository;

    @Test
    @DisplayName("새 게시글 저장")
    void create_new_board() {

        // given
        Board board = new Board(1L, "title", BoardCategory.Desert);

        // when
        Long dbBoardId = boardPersistenceAdapter.add(board);

        // then
        assertThat(dbBoardId).isEqualTo(1L);
    }

    @Test
    @DisplayName("게시글 ID로 조회")
    void find_board_by_id() {
    }
}