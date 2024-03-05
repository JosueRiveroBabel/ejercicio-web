package com.babel.hw.webexample.ejercicioweb;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserControllerImpl implements UserController{
    @Override
    @GetMapping("/user")
    public String User(@RequestParam("nombre") String name, @RequestParam("edad") int age,@RequestHeader("Accept-Language") String header) {
        UserImpl user = new UserImpl(name,age,header);

        return user.printJSON();
    }
}
