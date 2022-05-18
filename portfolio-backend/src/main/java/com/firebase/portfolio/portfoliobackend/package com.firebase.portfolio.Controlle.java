package com.firebase.portfolio.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController{
    
    @GetMapping ("/hola/{nombre}")
    public String decirHola(@PathVariable String nombre, 
                            @PathVariable int edad,
                            @PathVariable String profesion) {
        
        return "Hello Word. Tu nombre es: " + nombre + " tu edad es " + edad + " tu profesión es: " + profesion;

    }
}