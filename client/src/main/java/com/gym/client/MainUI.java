package com.gym.client;

import com.gym.core.User;
import com.gym.network.CallManager;

public class MainUI {
    private User currentUser;
    private CallManager callManager = new CallManager();

    public MainUI(User user) {
        this.currentUser = user;
    }

    public void renderInterface() {
        System.out.println("🎨 Загрузка темы: " + currentUser.currentTheme);
        System.out.println("🖼️ Установка иконки приложения из /resources/icon.png");
        
        System.out.println("👤 Профиль: " + currentUser.nickname + " [" + currentUser.role + "]");
        
        if (currentUser.role.equals("CREATOR")) {
            renderCreatorDashboard();
        }
    }

    private void renderCreatorDashboard() {
        System.out.println("--- 👑 ПАНЕЛЬ СОЗДАТЕЛЯ ---");
        System.out.println("[🔥 Кнопка: ОГОНЬ] - Активирует спецэффекты у всех");
        System.out.println("[💎 Кнопка: ВЫДАТЬ VIP] - Открывает список учеников");
    }

    public void switchTheme() {
        if (currentUser.currentTheme.equals("DARK")) {
            currentUser.currentTheme = "LIGHT";
        } else {
            currentUser.currentTheme = "DARK";
        }
        System.out.println("✨ Тема переключена на " + currentUser.currentTheme);
    }
    
    public void pressCallButton(String phone) {
        callManager.initCall(phone);
    }
}

