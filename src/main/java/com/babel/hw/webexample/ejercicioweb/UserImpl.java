package com.babel.hw.webexample.ejercicioweb;

import com.google.gson.Gson;

public class UserImpl implements User{
    String name;
    int age;
    String language;

    public UserImpl(String name, int age, String language) {
        this.name = name;
        this.age = age;
        this.language = language;
    }

    @Override
    public String printJSON() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
