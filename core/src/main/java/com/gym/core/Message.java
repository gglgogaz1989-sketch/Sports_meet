package com.gym.core;

import java.time.LocalDateTime;

public class Message {
    private String senderName;
    private String text;
    private LocalDateTime timestamp;

    public Message(String senderName, String text) {
        this.senderName = senderName;
        this.text = text;
        this.timestamp = LocalDateTime.now();
    }
}

