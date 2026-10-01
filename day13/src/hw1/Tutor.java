package hw1;

public class Tutor extends Teacher {

    public Tutor() {}

    public Tutor(String id, String name, String profession) {
        super(id, name, profession);
    }
    @Override
    public void work() {
        System.out.println("助教正在工作");
    }
}
