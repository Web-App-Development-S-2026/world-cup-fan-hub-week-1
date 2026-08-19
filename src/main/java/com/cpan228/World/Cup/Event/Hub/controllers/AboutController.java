package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String showAboutPage(Model model) {
        model.addAttribute("pageTitle", "Welcome to the 2026 World Cup Hub!");

        return "about";
    }
}