package com.example.kafka.moduls;

import java.time.LocalDateTime;

public record Message(String message , LocalDateTime createdAt) {
}
