package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext  con = SpringApplication.run(Project1Application.class, args);
		Alien a = (Alien)con.getBean(Alien.class,1);
		a.func();
	}

}
