package com.gym.core;

public enum Role {
    CREATOR("👑 Создатель", "#FFD700"), // Золотой
    VIP("💎 VIP", "#00BFFF"),         // Алмазный
    STUDENT("👤 Ученик", "#C0C0C0");    // Серебряный

    private final String displayTitle;
    private final String color;

    Role(String displayTitle, String color) {
        this.displayTitle = displayTitle;
        this.color = color;
    }

    public String getDisplayTitle() { return displayTitle; }
    public String getColor() { return color; }
}

