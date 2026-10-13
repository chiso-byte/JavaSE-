package localdatetime;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("今天是" + now);
        System.out.println(now.getYear());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        // 一年中的第几天
        System.out.println(now.getDayOfYear());
        // 星期
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfWeek().getValue());

        LocalDate localDate = now.toLocalDate();
        System.out.println(localDate);

        LocalTime localTime = now.toLocalTime();
        System.out.println(localTime);

    }
}
