package homework;

public class HW3 {
    public static void main(String[] args) {
        int fish = 24;
        int pea = 8;
        int rice = 3;
        int total = fish + pea + rice;
        double price1 = total > 30 ? total * 0.8 : total;
        fish = 16;
        double price2 = fish + pea + rice;
        double finalPrice = price1 > price2 ? price2 : price1;
        System.out.println(price1);
        System.out.println(price2);
        System.out.println("最少要花" + finalPrice);
    }
}
