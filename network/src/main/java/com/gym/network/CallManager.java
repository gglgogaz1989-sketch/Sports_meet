package com.gym.network;

public class CallManager {
    private boolean isCameraOn = false;
    private boolean isMicOn = false;

    public void initCall(String targetPhone) {
        System.out.println("🚀 Подготовка оборудования для звонка на: " + targetPhone);
        requestPermissions();
        this.isCameraOn = true;
        this.isMicOn = true;
        System.out.println("✅ Соединение установлено. Качество: HD");
    }

    private void requestPermissions() {
        // Симуляция доступа к железу
        System.out.println("🎙️ Доступ к микрофону получен.");
        System.out.println("📸 Доступ к камере получен.");
    }

    public void toggleVideo() {
        this.isCameraOn = !isCameraOn;
        System.out.println("Видео: " + (isCameraOn ? "ВКЛ" : "ВЫКЛ"));
    }

    public void endCall() {
        System.out.println("🔴 Звонок завершен. Камера и микрофон отключены.");
    }
}

