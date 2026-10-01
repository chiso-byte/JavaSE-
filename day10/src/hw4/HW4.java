package hw4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        boolean flag = isSame(str);
        System.out.println(flag);

        /*String revStr = reverse(str);
        System.out.println(str.equals(revStr));*/

    }

    // 方法二: 前后字符串进行比较判断
    public static boolean isSame(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            char a = str.charAt(i);
            char b = str.charAt(j);
            if (a != b) {
                return false;
            }
        }
        return true;
    }

    // 方法一:利用StringBuilder里的reverse方法进行判断
    /*public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }*/
}
