package hw1;

public class AdminStaff extends Employee {

    public AdminStaff() {}

    public AdminStaff(String id, String name, String profession) {
        super(id, name, profession);
    }
    @Override
    public void work() {
        System.out.println("行政部员工正在工作");
    }
}
