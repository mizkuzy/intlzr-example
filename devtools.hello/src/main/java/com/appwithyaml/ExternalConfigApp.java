package com.appwithyaml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalConfigApp {

    public static void main(String[] args) {
        SpringApplication.run(ExternalConfigApp.class, args);
    }

    /*
    * If you add --pageController.msg="Hello from command line"
    * in Program arguments in EditConfiguration then this value will be printed
    * instead of value in yaml properties even if the property from the file will not be commented*/
}
