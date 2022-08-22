package com.example.kafka.moduls;

public record MessageRequest(String message) {

    public MessageRequest(String message) {
        this.message = message;
    }

}
