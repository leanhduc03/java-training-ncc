package com.example.FirstSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

@Component
public class Client implements InjectionMessage {
    @Autowired
    private MessageService messageService;

//    Constructor injection
//    public Client(MessageService messageService) {
//        this.messageService = messageService;
//    }

//    Setter injection
//    public void setMessageService(MessageService messageService) {
//        this.messageService = messageService;
//    }

//Interface injection
    @Override
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }
}