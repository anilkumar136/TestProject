package com.example.demo2.service;

import com.example.demo2.domain.Player;
import com.example.demo2.repository.PlayerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource("classpath:test.properties")
class PlayerServiceTest {

    @MockBean
    PlayerRepository playerRepository;

    @Autowired
    PlayerService playerService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAllPlayer() {
        Mockito.when(playerRepository.findAll()).thenReturn(new ArrayList<Player>(Arrays.asList(new Player())));
        List<Player> playerList = playerService.getAllPlayer();

        Assertions.assertEquals(playerList.size(),1);
    }
}