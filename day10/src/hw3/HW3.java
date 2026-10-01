package hw3;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();
        int capNum = 0;
        int digNum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                capNum++;
            } else if (c >= '0' && c <= '9') {
                digNum++;
            }
        }
        System.out.println(capNum);
        System.out.println(digNum);
    }
}
