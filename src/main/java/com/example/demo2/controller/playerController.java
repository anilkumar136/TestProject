package com.example.demo2.controller;

import com.example.demo2.domain.Player;
import com.example.demo2.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class playerController {
    @Autowired
    PlayerService playerService;

    @GetMapping("/getAllPlayer")
    public ResponseEntity getAllPlayer(){
        List<Player> playerList = playerService.getAllPlayer();
        if(playerList.isEmpty()){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);

        }

        return new ResponseEntity(playerList,HttpStatus.OK);
    }
}
