package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "home")
public class HomeService {

    @Value("${home.service.some-string}")
    private String valueFromYaml;


    public String getString(){
        return valueFromYaml;
    }
}
