package hw;

public class Maintainer extends AdminStaff {
    public Maintainer() {}

    public Maintainer(String id, String name, String profession) {
        super(id, name, profession);
    }
    @Override
    public void work() {
        System.out.println("维护专员正在工作");
    }
}
