package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "2026 World Cup Hub");
        model.addAttribute("description", "The 2026 FIFA World Cup will be hosted by three countries: Canada, the United States, and Mexico. This tournament will be special because it brings fans from many cultures together across North America.");
        model.addAttribute("extraInfo", "I am Brazilian and I am wishing for the sixth Brazil Star!! .");

        return "about";
    }
}