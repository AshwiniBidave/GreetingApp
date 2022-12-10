package com.example.greetingapp.Repository;

import com.example.greetingapp.Entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetinRepo extends JpaRepository<Greeting,Integer> {
}
