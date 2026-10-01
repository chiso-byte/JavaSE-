package hw2;

import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        String str = generateCode();
        System.out.println(str);
    }

    // 长度为5
    // 内容中是四位字母，1位数字。
    // 其中数字只有1位，但是可以出现在任意的位置。
    public static String generateCode() {
        char[] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            if (i < 26) {
                chars[i] = (char)('a' + i);
            } else {
                chars[i] = (char)('A' - 26 + i);
            }
        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chars.length);
            sb.append(chars[randomIndex]);
        }
        int randomNum = r.nextInt(10);
        sb.append(randomNum);

        char[] temp = sb.toString().toCharArray();

        int randomIndex = r.nextInt(temp.length);
        char tempChar = temp[randomIndex];
        temp[randomIndex] = temp[temp.length - 1];
        temp[temp.length - 1] = tempChar;


        /*for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }*/
        return new String(temp);
    }
}
