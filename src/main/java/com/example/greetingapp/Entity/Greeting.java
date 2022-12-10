package com.example.greetingapp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor

public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String message;
    String fname;
    String lname;

    public Greeting(int id, String message, String fname, String lname) {
        this.id = id;
        this.message = message;
        this.fname = fname;
        this.lname = lname;
    }

    public Greeting(User user) {
       this.fname= user.getFname();
       this.lname= user.getLname();
    }

}
