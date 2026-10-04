package hw;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal animal, String something) {
        if (animal instanceof Dog d) {
            System.out.println(getAge() + "岁的" + getName() + "养了一只" + d.getAge() + "岁的" + d.getColor() + "颜色的狗");
            d.eat(something);
        } else if (animal instanceof Cat c) {
            System.out.println(getAge() + "岁的" + getName() + "养了一只" + c.getAge() + "岁的" + c.getColor() + "颜色的猫");
            c.eat(something);
        } else {
            System.out.println("输入的类型错误");
        }
    }
}
