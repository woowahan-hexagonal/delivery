package com.woowahanstudy.schoolvery.dutchpay.persistence;

import com.woowahanstudy.schoolvery.dutchpay.application.port.out.SaveBoardPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Repository
@Transactional(readOnly = true)
public class BoardPersistenceAdapter implements SaveBoardPort {

    private final BoardJpaRepository boardJpaRepository;
    @Override
    public void add(BoardEntity boardEntity) {
        boardJpaRepository.save(boardEntity);
    }
}
