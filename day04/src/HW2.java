import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数");
        int num3 = sc.nextInt();
        int temp;
        if (num1 < num2) {
            temp = num1;
        } else {
            temp = num2;
        }
        int min;
        if (temp < num3) {
            min = temp;
        } else {
            min = num3;
        }
        System.out.println(min);
    }
}
