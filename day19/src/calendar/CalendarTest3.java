package calendar;

import java.util.Calendar;

public class CalendarTest3 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DAY_OF_MONTH, 200);

        int y = instance.get(Calendar.YEAR);
        int m = instance.get(Calendar.MONTH) + 1;//转换为实际的月份
        int d = instance.get(Calendar.DAY_OF_MONTH);

        int wk = instance.get(Calendar.DAY_OF_WEEK);
        System.out.println("200天后是：" + y + "年" + m + "月" + d + "日" + getWeek(wk));

    }

    public static String getWeek(int i) {
        String[] weeks = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return weeks[i];
    }
}
