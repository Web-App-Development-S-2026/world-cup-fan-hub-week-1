package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("pageTitle", "Welcome to the 2026 World Cup Hub!");
        model.addAttribute("description",
                "The 2026 FIFA World Cup will be the 23rd edition, hosted by three nations: USA, Canada, and Mexico. "
                        + "It marks the first time the tournament will feature 48 teams, celebrating global unity and football passion.");
        return "about";
    }
}

