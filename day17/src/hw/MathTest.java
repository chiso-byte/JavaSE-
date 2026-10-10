package hw;

public class MathTest {
    public static void main(String[] args) {

        // 练习Math类,Math是一个工具类

        // 求绝对值
        System.out.println(Math.abs(-2));  // 2
        System.out.println(Math.abs(2));  // 2

        // 向上取整
        System.out.println(Math.ceil(23.45));  // 24.0
        System.out.println(Math.ceil(-23.45));  // -23.0

        // 向下取整
        System.out.println(Math.floor(23.45));  // 23.0
        System.out.println(Math.floor(-23.45));  // -24.0

        // 四舍五入
        System.out.println(Math.round(23.45));  // 23
        System.out.println(Math.round(-23.45));  // -23

        // 求最大值
        System.out.println(Math.max(23, 45));

        // 求最小值
        System.out.println(Math.min(23, 45));

        // 求次幂运算
        System.out.println(Math.pow(2,3));

        // 获得随机数 [0,1)
        System.out.println(Math.random());
    }
}
