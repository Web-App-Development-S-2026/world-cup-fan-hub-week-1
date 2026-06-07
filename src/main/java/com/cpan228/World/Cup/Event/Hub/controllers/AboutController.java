package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String about(Model model) {

        model.addAttribute("pageTitle",
                "Welcome to the 2026 World Cup Hub!");

        model.addAttribute("hostCountries",
                "USA, Canada, and Mexico");

        model.addAttribute("description",
                "The 2026 FIFA World Cup will be one of the biggest sporting events in the world. It is special because it will be hosted by three countries: the USA, Canada, and Mexico. Fans from around the globe will come together to celebrate football and international culture.");

        return "about";
    }
}