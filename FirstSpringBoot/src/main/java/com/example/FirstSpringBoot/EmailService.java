package com.example.FirstSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class EmailService implements MessageService {

    public EmailService() {
        System.out.println("EmailService created");
    }

    @PostConstruct
    public void PostEmail() {
        System.out.println("Post EmailService");
    }

    @PreDestroy
    public void PreEmail() {
        System.out.println("Destroy EmailService");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("send Email: " + message);
    }

}
