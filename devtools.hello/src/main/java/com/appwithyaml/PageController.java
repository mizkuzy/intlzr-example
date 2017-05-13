package com.appwithyaml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @Value("${pageController.msg}")
    private String pageControllerMsg;

    @Value("${my.secret}")
    private String mySecret;

    @Value("${app.name}")
    private String applName;

    @Value("${app.description}")
    private String appdescription;

    @RequestMapping("/")
    public String pageControllerMsg() {
        return pageControllerMsg;
    }

    @RequestMapping("/mysecret")
    public String randomStringValue() {
        return mySecret;
    }

    @RequestMapping("/about")
    public String about() {
        return applName + "\r\n" + appdescription;
    }

}
