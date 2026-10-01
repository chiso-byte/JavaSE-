package hw5;

public class Coder extends Employee{

    public Coder() {}

    public Coder(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("程序员正在编写代码");
    }
}
