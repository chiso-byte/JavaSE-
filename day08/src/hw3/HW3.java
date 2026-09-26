package hw3;

public class HW3 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("张三");
        manager.setId("123");
        manager.setSalary(15000);
        manager.setBonus(6000);
        manager.work();

        Coder coder = new Coder("李四", "135", 10000);
        coder.work();
    }
}
