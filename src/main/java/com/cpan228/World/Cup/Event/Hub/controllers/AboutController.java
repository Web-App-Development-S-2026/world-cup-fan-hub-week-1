package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String displayAbout(Model model){
        String pageTitle = "About the 2026 World Cup";
        String description = "The 2026 World Cup will be hosted by the USA, Canada, and Mexico. " +
                "This is the first time three countries will host together.";

        model.addAttribute("pageTitle", pageTitle);
        model.addAttribute("description", description);

        return "about";
    }
}
