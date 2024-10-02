package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageControllers {
    @RequestMapping("/home")
    public String home(Model model){
        // Sending Data to view
        model.addAttribute("name", "Spring Project Application");
        model.addAttribute("YotutubeChannel", "https://www.youtube.com/@FRIDAYoo7");
        model.addAttribute("GitRepo", "https://github.com/Anshul-01");
        System.out.println("Home page Handler");
        return "home";
    }
}
