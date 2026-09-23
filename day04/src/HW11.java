import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输出被除数");
        int dividend = sc.nextInt();
        System.out.println("输出除数");
        int divisor = sc.nextInt();
        int count = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            count ++;
        }
        System.out.println("余数为" + dividend);
        System.out.println("商为" + count);
    }
}
