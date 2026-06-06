package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class AboutController {

    public AboutController() {

    }

    @GetMapping("/about")
    public String getAbout(Model model) {
        String pageTitle = "About";
        model.addAttribute("pageTitle", pageTitle);
        return "about";
    }

}
