package com.example.kafka.controller;

import com.example.kafka.moduls.Message;
import com.example.kafka.moduls.MessageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    public MessageController(KafkaTemplate<String , Object> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }
    private KafkaTemplate<String , Object> kafkaTemplate;

    @PostMapping
    public void publish(@RequestBody MessageRequest messageRequest) {
        Message message = new Message(messageRequest.message(), LocalDateTime.now());
        kafkaTemplate.send("firstTopic" , message);

    }
}
