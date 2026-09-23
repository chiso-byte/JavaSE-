package homework;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int i = sc.nextInt();
        int len = getLen(i);
        System.out.println(i + "是" + len + "位数字");
    }

    public static int getLen(int i) {
        int len = 0;
        while (i > 0) {
            len++;
            i /= 10;
        }
        return len;
    }
}
