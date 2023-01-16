package com.springdi.springdependencyinjection.controllers;

import com.springdi.springdependencyinjection.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService){
        this.petService=petService;
    }
    public String petType(){
        return petService.getPetType();
    }
}
