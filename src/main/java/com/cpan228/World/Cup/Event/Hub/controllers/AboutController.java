package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String aboutPage(Model model) {
        String title = "Welcome to the 2026 World Cup Hub";
        String url = "https://activevancouver.ca/wp-content/uploads/2026/04/fifa-2026-vancouver.jpg";
        model.addAttribute("title", title);
        model.addAttribute("url", url);
        return "about";
    }
}
