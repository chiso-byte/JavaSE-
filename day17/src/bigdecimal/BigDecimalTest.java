package bigdecimal;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        System.out.println(0.009 + 0.001);

        // 测试BigDecimal,用来表示大小数

        // 常用的构造方法
        BigDecimal bd1 = new BigDecimal(0.001);  // 这种创建对象方式,可能还是不精确,所以一般不常用
        BigDecimal bd2 = new BigDecimal("0.001");
        System.out.println(bd1);
        System.out.println(bd2);

        // 通过静态方法获取BigDecimal对象
        // 内部有优化机制,当 0 <= x <= 10 时,会返回内部已经创建好的BigDecimal对象,而不是再重新创建
        BigDecimal bd3 = BigDecimal.valueOf(1);
        BigDecimal bd4 = BigDecimal.valueOf(1);
        System.out.println(bd3 == bd4);
        System.out.println(bd3);


    }
}
