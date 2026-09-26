package hw4;

public class HW4 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setBreed("波斯猫");
        cat1.setColor("花色");
        cat1.eat();
        cat1.catchMouse();

        Dog dog = new Dog("黑色", "藏獒");
        dog.eat();
        dog.lookHome();
    }
}
