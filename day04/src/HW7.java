import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输出第一个整数表示开始");
        int start = sc.nextInt();
        System.out.println("输出第二个整数表示结束");
        int end = sc.nextInt();
        int sum = 0;
        for (;start <= end; start ++) {
            sum += start;
        }
        System.out.println(sum);
    }
}
