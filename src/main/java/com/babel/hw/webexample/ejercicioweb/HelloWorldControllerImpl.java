package com.babel.hw.webexample.ejercicioweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControllerImpl implements HelloWorldController{


    @Override
    @GetMapping("/saludar")
    public String helloWorld() {
        return "Hola mundo";
    }
}
