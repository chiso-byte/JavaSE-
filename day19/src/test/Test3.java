package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        while (true) {
            if (sum > 200) {
                break;
            }
            System.out.println("请输入1~100的整数");
            String str = sc.nextLine();
            int number = Integer.parseInt(str);
            if (number < 1 || number > 100) {
                System.out.println("输入的数据不合法，请重新输入");
                continue;
            }
            list.add(number);
            sum += number;
        }
        System.out.println(sum);
    }
}
