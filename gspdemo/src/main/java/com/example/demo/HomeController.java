package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {
        //model.addAttribute("name", "sovik");
        return "index";
    }

/*    @RequestMapping("/")
    public String error(Model model) {
        //model.addAttribute("name", "sovik");
        return "error";
    }*/
}