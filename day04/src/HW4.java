import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顾客的类别（0表示普通顾客，1表示会员）");
        int vip = sc.nextInt();
        System.out.println("请输入购物的折前金额");
        int money = sc.nextInt();
        double discount = money;
        if (vip == 0) {
            if (money >= 100) {
                discount *= 0.9;
            }
        } else if (vip == 1) {
            if (money < 200) {
                discount *= 0.8;
            } else {
                discount *= 0.75;
            }
        } else {
            System.out.println("没有这种顾客类别");
        }
        System.out.println(discount);
    }
}
