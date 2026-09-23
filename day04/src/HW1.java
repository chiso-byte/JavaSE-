public class HW1 {
    public static void main(String[] args) {
        int newPhone = 7988;
        int oldPhone = 1500;
        double money1 = newPhone * 0.8;
        double money2 = newPhone - oldPhone;
        if (money1 < money2) {
            System.out.println("要以旧换新");
        } else {
            System.out.println("不要以旧换新");
        }
        System.out.println("换新价格" + money1);
        System.out.println("二手价格" + money2);
    }
}
