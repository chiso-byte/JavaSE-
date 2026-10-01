package hw3;

import java.util.ArrayList;

public class HW3 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee e1 = new Employee("张三",3000);
        Employee e2 = new Employee("李四",3500);
        Employee e3 = new Employee("王五",4000);
        Employee e4 = new Employee("赵六",4500);
        Employee e5 = new Employee("田七",5000);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);
            if (e.getName().equals("王五")) {
                e.setName("王小五");
            }

            // 列表有个注意点, 不能边删除, 便查找
            /*if (e.getName().equals("赵六")) {
                list.remove(e);
            }
           System.out.println(e.getName());
            if (e.getName().equals("田七")) {
                int newSal = e.getSalary() + 500;
                System.out.println(newSal);
                e.setSalary(newSal);
            }*/
        }

        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);
            if (e.getName().equals("赵六")) {
                list.remove(e);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Employee employee = list.get(i);
            if (employee.getName().equals("田七")) {
                int newSal = employee.getSalary() + 500;
                employee.setSalary(newSal);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);
            System.out.println("姓名: " + e.getName() + ", 工资: " + e.getSalary());
        }
    }
}
