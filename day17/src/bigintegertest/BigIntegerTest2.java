package bigintegertest;

import java.math.BigInteger;

public class BigIntegerTest2 {
    public static void main(String[] args) {
        // BigInteger的底层是由符号数字和int数组组成,对象一旦创建,内部的值不能被修改
        // 符号位:-1代表负数,0代表0,1代表正数
        // 它是将整数先转化为补码,再按照从低位到高位的顺序进行分组,32位为一组,转化为int整数,再存储到mag数组中
        // 可以通过断点调试来进行查看
        BigInteger b1 = BigInteger.valueOf(9999999999999999L);
        BigInteger b2 = BigInteger.valueOf(3);

        // 测试成员方法
        // 加
        BigInteger b3 = b1.add(b2);
        System.out.println(b3);
        // 减
        BigInteger b4 = b1.subtract(b2);
        System.out.println(b4);
        // 乘
        BigInteger b5 = b1.multiply(b2);
        System.out.println(b5);
        // 除
        BigInteger b6 = b1.divide(b2);
        System.out.println(b6);
        // 除数和余数
        BigInteger[] b7 = b1.divideAndRemainder(b2);
        System.out.println(b7[0]);  // 0索引为除数
        System.out.println(b7[1]);  // 1索引为余数
        // 判断是否相等
        System.out.println(b1.equals(b2));
        // 进行次幂运算
        BigInteger b8 = b1.pow(2);
        System.out.println(b8);
        // 返回最大值或最小值
        BigInteger b9 = b1.max(b2);
        System.out.println(b9);
        System.out.println(b9 == b1);
        // 转化为int类型
        // 若BigInteger的大小超出int范围,int数据有误
        int res = b1.intValue();
        System.out.println(res);
    }
}
