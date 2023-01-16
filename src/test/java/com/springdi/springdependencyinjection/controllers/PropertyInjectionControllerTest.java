package com.springdi.springdependencyinjection.controllers;

import com.springdi.springdependencyinjection.services.ConstructorGreetingService;
import com.springdi.springdependencyinjection.services.PropertyGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionControllerTest {
    PropertyInjectionController controller;
    @BeforeEach
    void setUp(){
        controller = new PropertyInjectionController();
        controller.greetingService = new PropertyGreetingService();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}