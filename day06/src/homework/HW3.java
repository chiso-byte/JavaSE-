package homework;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数:");
        int num3 = sc.nextInt();
        printVar(num1, num2, num3);
    }

    public static void printVar(int num1, int num2, int num3) {
        int tempMax = num1 > num2 ? num1 : num2;
        int max = tempMax > num3 ? tempMax : num3;
        int tempMin = num1 < num2 ? num1 : num2;
        int min = tempMin < num3 ? tempMin : num3;
        System.out.print(max + " " + tempMax + " " + min);
    }
}
