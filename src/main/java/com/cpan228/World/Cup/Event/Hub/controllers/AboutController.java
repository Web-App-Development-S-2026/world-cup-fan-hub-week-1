package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("pageTitle", "Welcome to the 2026 World Cup Hub!");
        model.addAttribute("description",
                "The FIFA World Cup 2026 will be the first ever World Cup with 48 teams. " +
                "This marks the first time three countries will jointly host the event with Mexico, Canada and the United States being the three countries. " +
                "Fans will see stars like Lionel Messi, Lamine Yamal, Alphonso Davies & Christian Pulisic on the sports world biggest stage!");
        return "about";
    }
}