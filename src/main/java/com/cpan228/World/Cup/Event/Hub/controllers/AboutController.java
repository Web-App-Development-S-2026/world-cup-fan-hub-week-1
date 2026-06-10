package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String showAboutPage(Model model) {
        model.addAttribute("pageTitle", "Welcome to the 2026 World Cup Fan Hub!");
        model.addAttribute("description", "The final game will be hosted at MetLife Stadium in New Jersey. " +
                "Because FIFA prohibits corporate sponsored name it will be called New York New Jersey Stadium during the World Cup tournament.");

        return "about";
    }
}
