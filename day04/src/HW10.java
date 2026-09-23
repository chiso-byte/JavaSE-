import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输出第一个整数");
        int x = sc.nextInt();
        int res = 0;
        int temp = x;
        while (x > 0) {
            int ge = x % 10;
            x /= 10;
            res = res * 10 + ge;
        }
        System.out.println(res == temp);
    }
}
