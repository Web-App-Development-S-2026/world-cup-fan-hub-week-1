package com.cpan228.World.Cup.Event.Hub.controllers;

import com.cpan228.World.Cup.Event.Hub.service.TeamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AboutController {

    private final TeamService teamService;

    public AboutController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/about")
    public String displayAboutPage(Model model) {
        model.addAttribute("pageTitle", "Welcome to the 2026 World Cup Hub!");
        model.addAttribute("description",
                "The 2026 FIFA World Cup will bring the tournament to North America with matches hosted across the USA, Canada, and Mexico. It is special because it is the first World Cup hosted by three countries and it expands the competition to 48 teams, giving more nations and fans a place on the biggest football stage.");
        model.addAttribute("hostCountries", List.of("USA", "Canada", "Mexico"));
        model.addAttribute("teams", teamService.getTeams());
        return "about";
    }
}