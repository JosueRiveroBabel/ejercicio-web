package com.babel.hw.webexample.ejercicioweb;

import jakarta.servlet.http.HttpServletRequest;

public interface UserController {
    UserImpl User(String name, int age, String header);
}
