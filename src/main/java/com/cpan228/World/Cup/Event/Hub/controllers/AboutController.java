package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String about(Model model) {

        model.addAttribute("pageTitle", "Welcome to the 2026 World Cup Hub!");

        model.addAttribute("description",
                "The 2026 FIFA World Cup will be hosted by Canada, USA, and Mexico. "
                        + "This will be the first World Cup hosted by three countries together. "
                        + "Millions of fans will watch the tournament and celebrate football from around the world.");

        return "about";
    }
}