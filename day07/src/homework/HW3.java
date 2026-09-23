package homework;

import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        String code = generateCode();
        System.out.println(code);
    }

    public static String generateCode() {
        char[] chs = new char[52];
        String code = "";
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                chs[i] = (char)('a' + i);
            } else {
                chs[i] = (char)('A' + i - 26);
            }
        }
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            code += chs[randomIndex];
        }
        int randomNum = r.nextInt(10);
        code += randomNum;
        return code;
    }
}
