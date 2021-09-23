package com.example.IPLBidding.service;

import com.example.IPLBidding.model.Team;
import com.example.IPLBidding.sql.TeamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    @Autowired
    TeamDao teamDao;

    public boolean registerTeam(Team team){
        return teamDao.registerTeam(team);
    }
}
