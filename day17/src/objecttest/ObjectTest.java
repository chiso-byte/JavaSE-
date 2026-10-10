package objecttest;

import java.util.Arrays;
import java.util.Objects;

public class ObjectTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student stu1 = new Student("alice", 18);
        // 未重写Object类的toString方法,默认打印全类名 + @ + hashcode
        String str = stu1.toString();  // objecttest.Student@4eec7777
        System.out.println(str);
        Student stu2 = new Student("alice", 18);
        // Object类的equals方法默认是用==号进行比较
        // 如果是基本数据类型判断值是否相等
        // 如果是引用数据类型判断地址值是否相等
        // 如果是自定义数据类型一般是要进行重写
        System.out.println(stu1.equals(stu2));  // false


        // Object的clone方法是protected,因此需要子类重写才能使用,同时子类还要实现cloneable接口
        // 浅拷贝是基本数据类型是复制值,引用数据类型是复制地址值
        // 深拷贝是基本数据类型是复制值,引用数据类型重新开辟空间,一个一个元素进行复制,返回的是一个新的地址值,只是内容一样
        // clone方法默认是浅拷贝
        Object clone = stu1.clone();
        System.out.println(clone.equals(stu1));

        stu1.arr[0] = 100;
        System.out.println(clone);
        System.out.println(stu1);

        System.out.println("=========================================");
        stu1.setAge(12);
        System.out.println(clone);
        System.out.println(stu1);
    }
}

class Student implements Cloneable {
    private String name;
    public int[] arr = {1, 2, 3, 4, 5, 6};
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    public String toString() {
        return name + ", " + age + ", " + printArr();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        Student clone = (Student)super.clone();
        clone.arr = newArr;
        return clone;
    }

    public String printArr() {
        return Arrays.toString(arr);
    }
}
