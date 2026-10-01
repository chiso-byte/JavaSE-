package hw1;

import java.util.ArrayList;

public class HW1 {
    public static void main(String[] args) {
        String[] str = {"aaa", "bbb", "aaa", "aaa", "ccc", " bbb"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        System.out.println(list);
    }
}
