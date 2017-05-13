package com.example.controller;

import com.example.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private HomeService homeService;
    @Value("${home.page}")
    private String homePage;
    @Value("${home.about}")
    private String about;

    @RequestMapping("/")
    public String home(){
        return homePage;
    }

    @RequestMapping("/about")
    public String about(){
        return about;
    }

    @RequestMapping("/service")
    public String getString(){
        return homeService.getString();
    }

    @Autowired
    public void setHomeService(HomeService homeService) {
        this.homeService = homeService;
    }
}
