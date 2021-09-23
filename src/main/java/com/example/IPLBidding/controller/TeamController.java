package com.example.IPLBidding.controller;

import com.example.IPLBidding.model.Team;
import com.example.IPLBidding.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @Autowired
    TeamService teamService;

    @CrossOrigin
    @PostMapping("/addteam")
    public boolean registerTeam(@RequestBody Team team){
        return teamService.registerTeam(team);
    }
}
