package com.hph.arq_event_1.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserEventListener {
    @EventListener
    public void handleUserCreateEvent(UserCreateEvent event) {
        System.out.println("User created: " + event.getUserModel().getUsername());
    }
}
