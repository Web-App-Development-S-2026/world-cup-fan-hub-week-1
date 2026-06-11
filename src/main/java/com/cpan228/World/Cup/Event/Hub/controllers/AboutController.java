package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String displayAboutPage(Model model) {
        model.addAttribute("pageTitle", "Welcome to the 2026 World Cup Hub!");
        model.addAttribute("hostCountries", "USA, Canada, and Mexico");
        model.addAttribute("mainMessage",
                "The 2026 FIFA World Cup will be special because it will be hosted by three countries: USA, Canada, and Mexico. Fans from around the world will be able to follow their favourite teams, learn about participating countries, and enjoy one of the biggest sporting events in the world.");

        return "about";
    }
}