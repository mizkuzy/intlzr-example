package com.example;

import com.example.controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootFundamentalsExerciseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootFundamentalsExerciseApplication.class, args);

		String[] names = ctx.getBeanDefinitionNames();

		HomeController homeController = (HomeController) ctx.getBean("homeController");
		for (String name : names) {
			System.err.println(name);
		}

	}
}
