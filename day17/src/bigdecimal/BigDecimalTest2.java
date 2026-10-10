package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest2 {
    public static void main(String[] args) {
        // Big Decimal底层使用byte[]进行存储的
        // 它是将每个数字都当成字符来进行存储
        BigDecimal bd1 = new BigDecimal("10.01");
        BigDecimal bd2 = new BigDecimal("3.09");

        // 测试成员方法
        // 加
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);
        // 减
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);
        // 乘
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);
        // 除得尽
//        BigDecimal bd7 = bd1.divide(bd2);
//        System.out.println(bd7);

        // 除不尽, 需要指定舍入模式
        // UP 远离0
        // DOWN 朝向0
        // CEILING 正坐标轴
        // FLOOR 负坐标轴
        // HALF_UP 四舍五入
        BigDecimal bd6 = bd1.divide(bd2, RoundingMode.HALF_UP);
        System.out.println(bd6);
    }
}
