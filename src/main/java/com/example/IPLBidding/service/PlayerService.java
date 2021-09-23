package com.example.IPLBidding.service;

import com.example.IPLBidding.model.Player;
import com.example.IPLBidding.sql.PlayerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    PlayerDao playerDao;

    public boolean registerPlayer(Player player){
        return playerDao.registerPlayer(player);
    }
}
