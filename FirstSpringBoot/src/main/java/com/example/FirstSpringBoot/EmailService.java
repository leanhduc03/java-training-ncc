package com.example.FirstSpringBoot;

import org.springframework.stereotype.Component;


public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("send Email: " + message);
    }

}
