public class Account {
    public String nickname;
    public String phoneNumber;
    public String avatarUrl;

    public void addFriend(String phone) {
        System.out.println("➕ Запрос в друзья отправлен на номер: " + phone);
    }
    
    public void sendPrivateMessage(String text, String toPhone) {
        System.out.println("💬 ЛС [Эмодзи разрешены]: " + text);
    }
}

