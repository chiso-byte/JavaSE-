package bigintegertest;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerTest {
    public static void main(String[] args) {
        // 测试BigInteger类，用来表示大整数

        // 常用的构造方法
        BigInteger b1 = new BigInteger(3, new Random());  // 获得随机的大整数,范围在[0- 2*3)
        System.out.println(b1);

        BigInteger b2 = new BigInteger("111");
        System.out.println(b2);

        BigInteger b3 = new BigInteger("100", 2);  // 获得指定进制的大整数 4, 进制与整数不匹配时会报错
        System.out.println(b3);

        // 通过静态方法获取BigInteger对象
        // 内部有优化机制,当 -16 <= x <= 16 时,会返回内部已经创建好的BigInteger对象,而不是再重新创建
        BigInteger b4 = BigInteger.valueOf(12);
        BigInteger b5 = BigInteger.valueOf(12);
        System.out.println(b4 == b5);
    }
}
