package date;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        // 构造方法
        Date date1 = new Date();  // 表示当前时间
        System.out.println(date1);

        Date date2 = new Date(0);  // 指定时间
        System.out.println(date2);

        // 成员方法
        date2.setTime(2000);  // 设置毫秒值
        System.out.println(date2);

        long time = date2.getTime();
        System.out.println(time);
    }
}
