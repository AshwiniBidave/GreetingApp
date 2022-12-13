package com.example.greetingapp.Service;

import com.example.greetingapp.Entity.Greeting;
import com.example.greetingapp.Entity.User;
import com.example.greetingapp.Repository.GreetinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class GreetingService implements Igreetingservice{

    @Autowired
    private GreetinRepo greetinRepo;
    @Override
    public String greetingMessage() {
        return "Hello World!";
    }


}
