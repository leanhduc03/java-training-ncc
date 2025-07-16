package com.example.FirstSpringBoot;

import com.example.FirstSpringBoot.others.SMSService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.example.FirstSpringBoot.others")
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);

		SMSService  smsService = context.getBean(SMSService.class);
		smsService.sendMessage("Hello World");

		EmailService emailService = context.getBean(EmailService.class);
		emailService.sendMessage("Hello World");
		EmailService emailService2 = context.getBean(EmailService.class);
		System.out.println(emailService2);
		System.out.println(emailService);

		Client client = context.getBean(Client.class);
		client.processMessage("Hello");
	}

}
