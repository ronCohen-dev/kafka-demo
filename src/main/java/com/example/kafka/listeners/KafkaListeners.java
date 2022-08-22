package com.example.kafka.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "firstTopic" , groupId = "ron")
    void listener(Object data){
        System.out.println("Listener Received : " + data);
    }
}
