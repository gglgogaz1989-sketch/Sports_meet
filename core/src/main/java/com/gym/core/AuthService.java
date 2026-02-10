package com.gym.core;

public class AuthService {
    public static final String MASTER_EMAIL = "gglgogaz1989@gmail.com";

    public User login(String email, String phone) {
        User user = new User(email, phone);
        if (email.equalsIgnoreCase(MASTER_EMAIL)) {
            user.setRole("CREATOR");
            user.setVip(true);
            System.out.println("👑 Доступ уровня СОЗДАТЕЛЬ разрешен!");
        }
        return user;
    }
}

