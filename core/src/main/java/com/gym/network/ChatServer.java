package com.gym.network;

import java.util.*;

public class ChatServer {
    private Map<String, String> activeCalls = new HashMap<>();

    public void startVoiceCall(String fromUser, String toUser) {
        System.out.println("📞 Соединение: " + fromUser + " -> " + toUser);
        // Тут подключается WebRTC для передачи голоса и видео
    }

    public void sendPrivateMessage(String from, String to, String text) {
        System.out.println("📩 [ЛС] " + from + " для " + to + ": " + text);
    }
}

