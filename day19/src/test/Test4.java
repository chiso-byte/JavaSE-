package test;

public class Test4 {
    public static void main(String[] args) {
        /*
        自己实现parseInt方法的效果，将字符串形式的数据转成整数。要求:
        字符串中只能是数字不能有其他字符,最少一位，最多10位,0不能开头
        */

        String str = "123456";
        System.out.println(parseInt(str));
        System.out.println(parseInt(str) + 111);

    }

    public static Integer parseInt(String str) {
        String regex = "[1-9]\\d{0,9}";
        if (!str.matches(regex)) {
            throw new NumberFormatException();
        }
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            number = number * 10 + str.charAt(i) - '0';
        }
        return number;
    }
}
