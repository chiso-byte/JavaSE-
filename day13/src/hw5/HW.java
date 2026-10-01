package hw5;

public class HW {
    public static void main(String[] args) {
        Coder coder = new Coder("heima001", "zhangsan", 7000);
        coder.work();

        Manager manager = new Manager("heima002", "lisi", 12000, 4000);
        manager.work();
    }
}
