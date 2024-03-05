package com.babel.hw.webexample.ejercicioweb;

import com.google.gson.Gson;

public class UserImpl {
    String name;
    int age;
    String language;

    public UserImpl(String name, int age, String language) {
        this.name = name;
        this.age = age;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLanguage() {
        return language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
