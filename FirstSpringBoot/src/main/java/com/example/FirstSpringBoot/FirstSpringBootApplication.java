package com.example.FirstSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);
		Client client = context.getBean(Client.class);
		client.processMessage("Hello");
	}

}
