package runtimetest;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        // Runtime代表运行环境
        // 获取Runtime对象，通过静态方法获取，以确保Runtime对象唯一
        Runtime runtime = Runtime.getRuntime();

        // 停止虚拟机运行
        // System类的exit方法底层也是调用Runtime类的exit方法
//        runtime.exit(0);

        // 获取CPU的线程数
        int i = runtime.availableProcessors();
        System.out.println(i);

        // JVM能从系统中获得总内存的大小,单位是Byte
        long l = runtime.maxMemory();
        System.out.println(l / 1024 / 1024);

        // JVM已经从系统中获得总内存的大小,单位是Byte
        long l1 = runtime.totalMemory();
        System.out.println(l1 / 1024 / 1024);

        // JVM剩余的内存
        long l2 = runtime.freeMemory();
        System.out.println(l2 / 1024 / 1024);

        // 运行cmd命令
//        runtime.exec("shutdown -s -t 10000");

        runtime.exec("shutdown -a");

    }
}
