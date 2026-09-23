package homework;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的价格");
        int price = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入舱位 0表示头等舱 1表示经济舱");
        int vip = sc.nextInt();

        if (month >= 5 && month <= 10) {
            price = getPrice(price, vip, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            price = getPrice(price, vip, 0.7, 0.65);
        } else {
            System.out.println("输入的月份错误");
        }
        System.out.println("机票的价格为" + price);
    }

    public static int getPrice(int price, int vip, double v0, double v1) {
        if (vip == 0) {
            price = (int) (price * v0);
        } else if (vip == 1) {
            price = (int) (price * v1);
        } else {
            System.out.println("输入的舱位错误");
        }
        return price;
    }

}
