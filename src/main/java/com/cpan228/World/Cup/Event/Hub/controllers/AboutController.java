package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String displayAbout(Model model) {
        model.addAttribute("pageTitle", "Welcome to the 2026 World Cup Hub!");
        model.addAttribute("edition", "23rd FIFA World Cup");
        model.addAttribute("hostCountries", new String[] { "United States", "Canada", "Mexico" });
        model.addAttribute("totalTeams", 48);
        model.addAttribute("totalVenues", 16);
        return "about";
    }
}