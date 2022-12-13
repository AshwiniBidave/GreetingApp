package com.example.greetingapp.Controller;

import com.example.greetingapp.Entity.Greeting;
import com.example.greetingapp.Entity.User;
import com.example.greetingapp.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/greeting")

public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @GetMapping("/get")
    public String getmessage(){
        return "Hello World";
    }
    @GetMapping("/hellobynames/{name}")
    public String getHello(@PathVariable String name) {
        return "Hello " + name;
    }
    @PostMapping("/create")
    public Greeting createGreeting(@RequestParam(value = "Fname",defaultValue = "world") String Fname,@RequestParam(value = "Lname",defaultValue = "world") String Lname){
        User user = new User();
        user.setFname(Fname);
        user.setLname(Lname);
        return greetingService.addGreeting(user);
    }

    @GetMapping("/path/{id}")
    public Greeting getElementById(@PathVariable int id){
        return greetingService.getGreetingById(id);
    }
}
