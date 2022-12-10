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

    @Override
    public String greetingMessage(String name) {
        String msg="Hello"+name;
        return msg;
    }

    @Override
    public Greeting addGreeting(User user) {
     Greeting greeting=new Greeting(user);
     greeting.setMessage("Hello");
     return  greetinRepo.save(greeting);


    }
//5
    @Override
    public Greeting getGreetingById(int id) {
        return greetinRepo.findById(id).get();

    }
//6
    @Override
    public List<Greeting> getAll() {
        return greetinRepo.findAll();

    }


    //7
    @Override
    public Greeting editGreetingById(int id,String name) {
        Greeting greeting = greetinRepo.findById(id).get();
        greeting.setMessage("Hello");
        greeting.setFname(name);
        greetinRepo.save(greeting);
        return greeting;
    }
    //8
    @Override
    public List<Greeting> deleteGreetingById(int id) {
        greetinRepo.deleteById(id);
        return greetinRepo.findAll();
    }
}
