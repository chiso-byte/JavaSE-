package localtime;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        int hour = now.getHour();
        System.out.println(hour);

        int minute = now.getMinute();
        System.out.println(minute);

        int second = now.getSecond();
        System.out.println(second);

        int nano = now.getNano();
        System.out.println(nano);

        System.out.println("-------------------------------");

        System.out.println(LocalTime.of(8,20));
        System.out.println(LocalTime.of(8,20,30));
        System.out.println(LocalTime.of(8,20,30,150));
        LocalTime of = LocalTime.of(8, 20, 30);
        System.out.println(of);

        System.out.println(of.isBefore(now));
        System.out.println(of.isAfter(now));

        System.out.println(of.withHour(10));

        System.out.println(of.plusHours(10));


    }
}
