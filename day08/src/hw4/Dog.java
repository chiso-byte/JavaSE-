package hw4;

public class Dog {
    private String color;
    private String breed;

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public void eat() {
        System.out.println(color + "的" + breed + "正在啃骨头....");
    }

    public void lookHome() {
        System.out.println(color + "的" + breed + "正在看家....");
    }
}
