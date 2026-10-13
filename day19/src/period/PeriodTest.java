package period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        // 年 月 日
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate of = LocalDate.of(2000, 1, 1);
        System.out.println(of);

        Period between = Period.between(of, now);
        System.out.println(between);
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());

        System.out.println(between.toTotalMonths());
    }
}
