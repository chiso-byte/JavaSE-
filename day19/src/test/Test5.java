package test;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        /*
         定义一个方法自己实现toBinaryString方法的效果，
         将一个十进制整数转成字符串表示的二进制
         */
        Integer i = Integer.valueOf(100);
        System.out.println(toBinaryString(i));
        System.out.println(Integer.toBinaryString(i));

    }

    public static String toBinaryString(Integer i) {
        StringBuilder sb = new StringBuilder();
        while (i != 0) {
            int temp = i % 2;
            sb.append(temp);
            i /= 2;
        }
        return sb.reverse().toString();
    }
}
