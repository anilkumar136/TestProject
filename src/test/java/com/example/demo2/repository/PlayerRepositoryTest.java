package com.example.demo2.repository;

import com.example.demo2.domain.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource("classpath:test.properties")
class PlayerRepositoryTest {
    @Autowired
    PlayerRepository playerRepository;

    @Test
    public void findAllTest(){
        List<Player> playerList = playerRepository.findAll();
        Assertions.assertEquals(playerList.size(),0 );
    }

}