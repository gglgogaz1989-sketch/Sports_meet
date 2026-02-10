package com.gym.core;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String email;
    public String nickname;
    public String phone;
    public String avatarPath;
    public boolean isVip;
    public String role; // "CREATOR", "VIP", "STUDENT"
    public String currentTheme = "DARK"; // Светлая/Темная

    public User(String email, String nickname, String phone) {
        this.email = email;
        this.nickname = nickname;
        this.phone = phone;
        
        // ПРОВЕРКА НА СОЗДАТЕЛЯ
        if (email.equalsIgnoreCase("gglgogaz1989@gmail.com")) {
            this.role = "CREATOR";
            this.isVip = true;
        } else {
            this.role = "STUDENT";
            this.isVip = false;
        }
    }
}

