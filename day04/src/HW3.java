import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存入金额");
        int money = sc.nextInt();
        System.out.println("请输入存入年限");
        int year = sc.nextInt();
        double rate = 0;
        if (year == 1) {
            rate = 0.0225;
        } else if (year == 2) {
            rate = 0.027;
        } else if (year == 3) {
            rate = 0.0325;
        } else if (year == 5) {
            rate = 0.036;
        } else {
            System.out.println("输入年限错误，请重新输入");
        }
        double deposit = money + money * rate * year;
        System.out.println(deposit);
    }
}
