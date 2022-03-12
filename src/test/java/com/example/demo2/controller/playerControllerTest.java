package com.example.demo2.controller;

import com.example.demo2.domain.Player;
import com.example.demo2.repository.PlayerRepository;
import com.example.demo2.service.PlayerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.ArrayList;
import java.util.Arrays;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource("classpath:test.properties")
@AutoConfigureMockMvc
class playerControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    PlayerService playerService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAllPlayer() throws Exception {
        Player player = new Player();
        player.setPlayerID("100");

        Mockito.when(playerService.getAllPlayer()).thenReturn(new ArrayList<>(Arrays.asList(player)));

        MvcResult mvcResult = mockMvc.perform(get("/getAllPlayer")).andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString());
    }
}