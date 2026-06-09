package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String displayAbout(Model model){
        String pageTitle = "Welcome to the 2026 World Cup";
        String tournamentDescription = "Apparently there’s some soccer thing happening in 2026.\n" +
        "the 23rd one of these tournaments they do every four years.\n" +
        "It runs from June 11 to July 19, in a bunch of cities across the U.S., Mexico, and Canada.\n" +
        "First time three countries are hosting, and now they’ve expanded from 32 teams to 48, for whatever that’s worth.";
        String hostCountries = "USA, Canada, and Mexico";

        model.addAttribute("pageTitle", pageTitle);
        model.addAttribute("description", tournamentDescription);
        model.addAttribute("hostCountries", hostCountries);

        return "about";
    }
}