package com.example.greetingapp.Service;

import com.example.greetingapp.Entity.Greeting;
import com.example.greetingapp.Entity.User;
import com.example.greetingapp.Repository.GreetinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class GreetingService implements Igreetingservice {

    @Autowired
    private GreetinRepo greetinRepo;

    @Override
    public String greetingMessage() {
        return "Hello World!";
    }

    @Override
    public String greetingMessage(String name) {
        String msg = "Hello" + name;
        return msg;
    }
    @Override
    public Greeting addGreeting(User user) {
        Greeting greeting=new Greeting(user);
        greeting.setMessage("Hello");
        return  greetinRepo.save(greeting);
    }
    @Override
    public Greeting getGreetingById(int id) {
        return greetinRepo.findById(id).get();
    }
    @Override
    public List<Greeting> getAll() {
        return greetinRepo.findAll();
    }



}