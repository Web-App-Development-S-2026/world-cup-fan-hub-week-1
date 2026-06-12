package com.cpan228.World.Cup.Event.Hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String getAbout(Model model) {
        model.addAttribute("pagetitle", "Welcome to the 2026 World Cup Hub!");
        
    model.addAttribute("description",
        "The 2026 FIFA World Cup is set to be an unforgettable event, bringing together nations from around the globe in a celebration of football." +
        "Hosted jointly by the United States, Canada, and Mexico, featuring 48 teams competing across multiple cities. "+
        "Fans can look forward to thrilling matches, vibrant cultural experiences, and a showcase of the world's best football talent."); 
        
     model.addAttribute("hostCountries", "USA, Canada, Mexico");   
        return "about";
    }

}
