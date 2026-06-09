package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String displayAbout(Model model) {
        String pageTitle = "About World Cup Hub";

        model.addAttribute("pageTitle", pageTitle);
        model.addAttribute("title", "Welcome to the 2026 World Cup Hub!");
        model.addAttribute("hostedBy", "USA, Canada, and Mexico");

        return "about";
    }
}
