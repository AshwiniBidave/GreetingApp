package com.example.greetingapp.Service;

import com.example.greetingapp.Entity.Greeting;
import com.example.greetingapp.Entity.User;

import java.util.List;

public interface Igreetingservice {
    String greetingMessage();

    String greetingMessage(String name);

    Greeting addGreeting(User user);

    Greeting getGreetingById(int id);

    List<Greeting> getAll();


    List<Greeting> deleteGreetingById(int id);

   Greeting editGreetingById(int id, String name);


}
