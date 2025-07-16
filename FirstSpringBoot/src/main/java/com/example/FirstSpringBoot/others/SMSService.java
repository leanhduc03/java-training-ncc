package com.example.FirstSpringBoot.others;

import com.example.FirstSpringBoot.MessageService;
import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("send SMS: " + message);
    }
}
