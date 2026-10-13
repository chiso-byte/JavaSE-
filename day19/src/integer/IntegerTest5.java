package integer;

public class IntegerTest5 {
    public static void main(String[] args) {
        // valueOf方法，底层有优化，会提前创建 -128~127 的Integer对象
        Integer i1 = Integer.valueOf(123);
        Integer i2 = Integer.valueOf("123");
        Integer i3 = Integer.valueOf("123", 8);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        Integer i4 = Integer.valueOf(128);
        Integer i5 = Integer.valueOf(128);
        System.out.println(i4 == i5);
    }
}
