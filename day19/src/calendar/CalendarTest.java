package calendar;

import date.DateTest;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        int year = calendar.get(Calendar.YEAR);
        // 这里需要注意calendar的month是从0开始计数的
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

        int hour = calendar.get(Calendar.HOUR);
        int minutes = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(hour);
        System.out.println(minutes);
        System.out.println(second);

        // 返回值是1-7, 1代表的是周日
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);

        System.out.println(year + "年" + month + "月" + day + "日 " +
                hour + ":" + minutes + ":" + second + " 这周是" + getWeek(week));

    }

    public static String getWeek(int i) {
        String[] weeks = {"", "星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return weeks[i];
    }
}
