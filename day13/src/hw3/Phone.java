package hw3;

public class Phone {
    private String brand;
    private int price;
    private static int size = 6;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void call() {
        System.out.println("手机正在打电话");
    }

    public void sendMessage() {
        System.out.println("手机正在发短信");
    }

    public void playGame() {
        System.out.println("手机正在玩游戏");
    }

    public void show() {
        System.out.println(brand + ", " + price + ", " + size);
    }
}
