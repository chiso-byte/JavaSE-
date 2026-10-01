package hw6;

public class HW {
    public static void main(String[] args) {
        Cat cat = new Cat(2, "白色");
        Dog dog = new Dog(2, "黑色");
        Person person = new Person("zhangsan", 21);
        person.keepPet(cat, "小鱼干");
        person.keepPet(dog, "骨头");
    }
}
