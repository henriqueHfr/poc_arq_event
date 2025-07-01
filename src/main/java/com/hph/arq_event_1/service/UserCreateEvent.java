package com.hph.arq_event_1.service;

import com.hph.arq_event_1.models.UserModel;
import org.springframework.context.ApplicationEvent;

public class UserCreateEvent extends ApplicationEvent {

    private final UserModel userModel;

    public UserCreateEvent(Object source, UserModel userModel) {
        super(source);
        this.userModel = userModel;
    }

    public UserModel getUserModel() {
        return userModel;
    }
}
