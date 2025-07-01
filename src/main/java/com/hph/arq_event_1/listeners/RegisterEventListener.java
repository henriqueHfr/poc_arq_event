package com.hph.arq_event_1.listeners;

import com.hph.arq_event_1.events.RegisterCreateEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RegisterEventListener {

    @EventListener
    public void handleRegisterCreateEvent(RegisterCreateEvent event) {
        System.out.println("Register created: " + event.getRegisterModel().getUsername());
    }
}
