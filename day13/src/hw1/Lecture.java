package hw;

public class Lecture extends Teacher{

    public Lecture() {}

    public Lecture(String id, String name, String profession) {
        super(id, name, profession);
    }
    @Override
    public void work() {
        System.out.println("讲师正在工作");
    }
}
