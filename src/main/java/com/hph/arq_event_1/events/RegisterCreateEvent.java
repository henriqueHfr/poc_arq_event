package com.hph.arq_event_1.events;

import com.hph.arq_event_1.models.RegisterModel;
import org.springframework.context.ApplicationEvent;

public class RegisterCreateEvent extends ApplicationEvent {
    private final RegisterModel registerModel;

    public RegisterCreateEvent(Object source, RegisterModel registerModel) {
        super(source);
        this.registerModel = registerModel;
    }

    public RegisterModel getRegisterModel() {
        return registerModel;
    }

}
