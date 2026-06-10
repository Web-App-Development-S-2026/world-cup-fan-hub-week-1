package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "About the 2026 World Cup");
        model.addAttribute("edition", "23rd");
        model.addAttribute("hostCountries", new String[]{"Canada", "Mexico", "United States"});
        return "about";
    }
}