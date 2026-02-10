package com.gym.client;

public class RigAnalyzer {
    public void processCameraFrame(byte[] frame) {
        // Анализ: голова, руки /|\, ноги /\
        System.out.println("🔍 Ищу риг пользователя...");
        boolean isMatching = true; // Симуляция
        if (isMatching) {
            System.out.println("✅ Риг совпал! Упражнение засчитано.");
        }
    }
}

