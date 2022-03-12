package com.example.demo2.service;

import com.example.demo2.domain.Player;
import com.example.demo2.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    public List<Player> getAllPlayer(){
        return playerRepository.findAll();
    }
}
