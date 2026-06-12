package com.cpan228.World.Cup.Event.Hub.controllers;

import com.cpan228.World.Cup.Event.Hub.service.TeamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {

    private TeamService teamService;

    public TeamController(TeamService service){
        this.teamService = service;
    }

    @GetMapping("/")
    public String displayTeams(Model model) {
        String pageTitle = "World Cup Hub";
        model.addAttribute("pageTitle", pageTitle);
        model.addAttribute("teams", this.teamService.getTeams());
        return "home";
    }

}
