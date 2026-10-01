package hw2;

import java.util.ArrayList;

public class HW2 {
    public static void main(String[] args) {
        ArrayList<Teacher> list = new ArrayList<Teacher>();
        Teacher t1 = new Teacher("赵老师", "javase");
        Teacher t2 = new Teacher("钱老师", "javaee");
        Teacher t3 = new Teacher("孙老师", "php");
        Teacher t4 = new Teacher("李老师", "python");
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        for (int i = 0; i < list.size(); i++) {
            Teacher teacher = list.get(i);
            System.out.println("姓名: " + teacher.getName() + ", 专业: " + teacher.getProfession());
        }
    }
}
