package com.example.Spring.component;

import org.springframework.stereotype.Component;

@Component
public class Demobean {
    private String message = "Hello from Demobean!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Demobean{" +
                "message='" + message + '\'' +
                '}';
    }
}