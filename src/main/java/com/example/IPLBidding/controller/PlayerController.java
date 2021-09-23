package com.example.IPLBidding.controller;

import com.example.IPLBidding.model.Player;
import com.example.IPLBidding.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @CrossOrigin
    @PostMapping("/addplayer")
    public boolean registerPlayer(@RequestBody Player player){
        return playerService.registerPlayer(player);
    }
}
