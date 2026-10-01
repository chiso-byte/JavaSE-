package hw5;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号码");
        String str = sc.next();
        boolean flag = check(str);
        System.out.println(flag);

    }

    // 号码为18位，
    // 不能以数字0开头，
    // 前17位只可以是数字，
    // 最后一位可以是数字或者大写字母X
    public static boolean check(String str) {
        if (str.length() != 18) {
            return false;
        }
        if (str.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < str.length() - 1; i ++) {
            char c = str.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        char c = str.charAt(str.length() - 1);
        if (c >= '0' && c <= '9' || c == 'x' || c =='X') {
            return true;
        }
        return false;
    }
}
