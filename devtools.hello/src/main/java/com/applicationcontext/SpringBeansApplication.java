package com.applicationcontext;

import com.applicationcontext.models.MyUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan({"com.applicationcontext.services","com.applicationcontext.controllers"})
public class SpringBeansApplication {

    @Bean
    public MyUser myUser(){
        return new MyUser("Lucy", "Ru");
    }
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBeansApplication.class, args);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.err.println(beanName);
        }

        System.err.println(ctx.getBean("myUser").toString());
    }
}
