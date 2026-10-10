package systemtest;

import java.util.Arrays;

public class SystemTest {
    public static void main(String[] args) {
        // 测试System类,System是工具类

        // 记录当前的毫秒值
        // 方式一：暴力枚举
//        long start = System.currentTimeMillis();
//        for (int i = 1; i <= 100000; i++) {
//            if (IsPrime.isPrime(i)) {
//            }
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);  // 1869 2035 1797

        // 方式二: 使用合数的性质
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            if (isPrime(i)) {

            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);  // 4 5


    }

    private static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(j); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
