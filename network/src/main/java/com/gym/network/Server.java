package com.gym.network;

import java.net.ServerSocket;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    // Список всех, кто в сети (для всего города)
    private static ConcurrentHashMap<String, String> onlineUsers = new ConcurrentHashMap<>();

    public void startServer() {
        System.out.println("🌐 Сервер запущен на 300МБ ОЗУ...");
        // Логика ожидания подключений
    }
    
    public void handlePrivateCall(String fromPhone, String toPhone) {
        System.out.println("📞 Звонок по номеру: " + fromPhone + " -> " + toPhone);
    }
}
