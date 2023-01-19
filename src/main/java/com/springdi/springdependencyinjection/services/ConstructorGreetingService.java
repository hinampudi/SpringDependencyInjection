package com.springdi.springdependencyinjection.services;

import org.springframework.stereotype.Service;
//@Service - We are declaring it using config file.
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -----Constructor";
    }
}
