package hw1;

import java.util.Random;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        // 字符串是不能被修改的
        /*for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int randomIndex = r.nextInt(str.length());
            char temp =
        }*/

        // 字符串如果需要进行修改,必须先转换为字符数组或者是StringBuilder容器
        // 先把字符串转化为字符数组
        char[] chars = str.toCharArray();
        Random r = new Random();
        for (int i = 0; i < chars.length; i++) {
            int randomIndex = r.nextInt(chars.length);
            char temp = chars[i];
            chars[i] = chars[randomIndex];
            chars[randomIndex] = temp;
        }
        String result = new String(chars);
        System.out.println(result);
    }
}
