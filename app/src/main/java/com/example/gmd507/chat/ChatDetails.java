package com.example.gmd507.chat;

public class ChatDetails {

    private String name, message, time;

    public ChatDetails(String name, String message, String time) {
        this.name = name;
        this.message = message;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }
}
