package com.babel.hw.webexample.ejercicioweb;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserControllerImpl implements UserController {
    @Override
    @GetMapping(value = "/user", produces = "application/json")
    public UserImpl User(@RequestParam(defaultValue = "desconocido", value = "nombre", required = false)
                         String name, @RequestParam(defaultValue = "0", value = "edad", required = false)
                         int age, @RequestHeader("Accept-Language") String header) {
        return new UserImpl(name, age, header);
    }
}
