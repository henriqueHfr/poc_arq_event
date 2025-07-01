package com.hph.arq_event_1.controller;

import com.hph.arq_event_1.events.RegisterCreateEvent;
import com.hph.arq_event_1.models.RegisterModel;
import com.hph.arq_event_1.models.UserModel;
import com.hph.arq_event_1.events.UserCreateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private ApplicationEventPublisher publisher;


     @PostMapping("/register/")
     public ResponseEntity<String> registerUser(@RequestBody RegisterModel user) {
         publisher.publishEvent(new RegisterCreateEvent(this, user));
         return ResponseEntity.ok("User registered successfully");
     }

     @PostMapping("/login/")
     public ResponseEntity<String> loginUser(@RequestBody UserModel user) {
         publisher.publishEvent(new UserCreateEvent(this, user));
         return ResponseEntity.ok("User logged in successfully");
     }
}
