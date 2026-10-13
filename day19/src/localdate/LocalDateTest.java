package localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class LocalDateTest {
    public static void main(String[] args) {
        // LocalDate 单纯指 年月日
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // 获得指定的时间日历对象
        LocalDate of = LocalDate.of(2023, 6, 23);
        System.out.println(of);

        // getXxx 获取日历对象的每个属性
        int year = of.getYear();
        System.out.println("year: " + year);

        // 获取月:方式一
        int month = of.getMonthValue();
        System.out.println(month);

        // 方式二
        Month month1 = of.getMonth();
        System.out.println(month1);
        System.out.println(month1.getValue());

        // 获取日
        int day = of.getDayOfMonth();
        System.out.println(day);

        int dayOfYear = of.getDayOfYear();
        System.out.println(dayOfYear);

        DayOfWeek week = of.getDayOfWeek();
        System.out.println(week);
        System.out.println(week.getValue());

        LocalDate localDate = of.withYear(2000);
        System.out.println(localDate);

        LocalDate localDate1 = localDate.minusYears(1);
        System.out.println(localDate1);

        LocalDate localDate2 = localDate.plusYears(1);
        System.out.println(localDate2);

        LocalDate of1 = LocalDate.of(2000, 1, 1);
        System.out.println(of1);
        LocalDate now1 = LocalDate.now();
        System.out.println(now1);

        MonthDay of2 = MonthDay.of(of1.getMonthValue(), of1.getDayOfMonth());
        MonthDay of3 = MonthDay.of(now1.getMonthValue(), now1.getDayOfMonth());
        System.out.println("今天是你的生日吗?" + of2.equals(of3));

    }
}
