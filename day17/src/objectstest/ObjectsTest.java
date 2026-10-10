package objectstest;

import java.util.Objects;

public class ObjectsTest {
    public static void main(String[] args) {
        // 测试Objects类,Objects是一个工具类
        int i = 123;
        // 获取对象的字符串表现形式
        String res = Objects.toString(i);
        System.out.println(res);

        // equals方法,比较两个对象是否相等
        System.out.println(Objects.equals(new String("aaa"), new String("aaa")));

        // isNull方法,判断对象是否是null
        System.out.println(Objects.isNull(""));
        // nonNull方法,判断对象是否不是null
        System.out.println(Objects.nonNull(""));

    }
}
