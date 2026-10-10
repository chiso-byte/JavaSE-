package systemtest;

import java.util.Arrays;
import java.util.Objects;

public class SystemTest3 {
    public static void main(String[] args) {
        // 数组拷贝
        // 默认是浅拷贝

        String[] arr = {"23", "45", "67", "89", "14", "56"};
        Object[] desArr = new Object[arr.length - 1];

        // 因为arraycopy底层是将数组当成Object类型传过去
        // 如果源数组和目标数组都是基本数据类型,则需要类型保持一致
        // 拷贝时要考虑数组的长度,如果超出范围会报错
        // 如果源数组和目标数组是引用类型,且目标数组是源数组的父类,则可以进行复制,使用的是多态

        /* 第一个参数是指:源数组
           第二个参数是指:源数组的起始索引
           第三个参数是指:目标数组
           第四个参数是指:目标数组的起始索引
           第五个参数是指:要拷贝的长度
         */
        System.arraycopy(arr, 0, desArr, 0, 2);
        System.arraycopy(arr, 3, desArr, 2, arr.length - 3);

        System.out.println(Arrays.toString(desArr));
    }
}
