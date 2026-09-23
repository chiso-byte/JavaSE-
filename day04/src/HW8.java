import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输出第一个整数表示开始");
        int start = sc.nextInt();
        System.out.println("输出第二个整数表示结束");
        int end = sc.nextInt();
        int count = 0;
        for (; start <= end; start ++) {
            if (start % 3 == 0 && start % 5 == 0) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
