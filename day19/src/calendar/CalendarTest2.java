package calendar;

import java.util.Calendar;

public class CalendarTest2 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();

        //计算班长出生那天是星期几(假如班长出生日期为：1998年3月18日)
        instance.set(Calendar.YEAR, 1983);
        instance.set(Calendar.MONTH, 3 - 1);
        instance.set(Calendar.DAY_OF_MONTH, 18);
        int week = instance.get(Calendar.DAY_OF_WEEK);
        System.out.println(getWeek(week));
    }

    public static String getWeek(int i) {
        String[] weeks = {"", "星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return weeks[i];
    }
}
