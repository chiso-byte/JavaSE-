package hw3;

public class HW {
    public static void main(String[] args) {
        Phone phone = new Phone("xiaomi", 3999);
        phone.show();
        phone.call();
        phone.sendMessage();
        phone.playGame();
        Phone apple = new Phone();
        apple.show();
    }
}
