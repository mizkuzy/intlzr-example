package com.applicationcontext.controllers;

import com.applicationcontext.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private NotificationService notificationService;

    @RequestMapping("/")
    public String home() {
        return notificationService.toString();
    }
/*@RestController
public class HelloController {

    @RequestMapping("/")
    public String  hello(){
        return "Hello";
    }
}*/
    @Autowired
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
