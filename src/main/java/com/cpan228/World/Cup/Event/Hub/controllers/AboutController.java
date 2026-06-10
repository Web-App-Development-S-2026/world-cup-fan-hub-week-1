package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "Welcome to the 2026 World Cup Hub!");
        model.addAttribute("description", "The 2026 FIFA World Cup will be hosted by three countries: USA, Canada, and Mexico. This makes it special because fans from different parts of North America will come together to celebrate football. This page shares information about the tournament and the participating countries.");

        return "about";
    }
}