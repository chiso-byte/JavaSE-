package hw1;

public class Buyer extends AdminStaff {

    public Buyer() {

    }

    public Buyer(String id, String name, String profession) {
        super(id, name, profession);
    }
    @Override
    public void work() {
        System.out.println("采购专员正在工作");
    }
}
