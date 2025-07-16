package com.example.FirstSpringBoot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {

    @Bean
//  @Scope("prototype") or singleton
//  @Lazy
    @Primary
    public EmailService emailService() {
        return new EmailService();
    }
}
