package hw1;

public class Teacher extends Employee {
    public Teacher() {}

    public Teacher(String id, String name, String profession) {
        super(id, name, profession);
    }
    @Override
    public void work() {
        System.out.println("教研部员工正在工作");
    }
}
