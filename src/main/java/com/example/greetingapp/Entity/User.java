package com.example.greetingapp.Entity;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class User {

    String fname;
    String lname;

    public User() {
        this.fname = fname;
        this.lname = lname;
    }

    public User(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
}
