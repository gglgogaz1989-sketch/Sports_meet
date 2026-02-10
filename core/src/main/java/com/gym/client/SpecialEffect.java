package com.gym.client;

import com.gym.core.User;

public class SpecialEffects {
    // Та самая кнопка "ОГОНЬ"
    public void activateFire(User user) {
        if (!"CREATOR".equals(user.getRole())) return;
        
        System.out.println("🔥 АКТИВАЦИЯ ЭФФЕКТА: ПОТОК ОГНЯ!");
        for(int i = 0; i < 100; i++) {
            // Эмодзи летают по экрану без потери FPS
            renderEmojiAtRandomPos("🔥");
        }
    }

    private void renderEmojiAtRandomPos(String emoji) {
        // Логика отрисовки для Android/iOS/PC
    }
}

