package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AboutController {
    @GetMapping("/about")
    public String aboutPage(Model model) {
        // Passing dynamic title
        model.addAttribute("title", "Welcome to the World Cup Fan Hub.");

        return "about";
    }
    
}
