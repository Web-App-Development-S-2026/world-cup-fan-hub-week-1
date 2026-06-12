package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import com.cpan228.World.Cup.Event.Hub.service.TeamService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class AboutController {
    private TeamService teamService;

    public AboutController(TeamService service){
        this.teamService = service;
    }

    @GetMapping("/about")
    public String displayAbout(Model model){
        String aboutTitle= "About Page";
        model.addAttribute("pageTitle", aboutTitle);

        return "about";

    }
}