package com.configpropsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class ConfigPropsApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ConfigPropsApp.class, args);

        MyAppConfig myAppConfig = (MyAppConfig) ctx.getBean("myAppConfig");
        System.out.println(myAppConfig);


    }
}
