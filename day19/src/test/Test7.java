package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Test7 {
    public static void main(String[] args) throws ParseException {
        // JDK7
        Calendar instance = Calendar.getInstance();
        instance.set(2000, 2, 1);
        instance.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH) == 29);


        // JDK8
        LocalDate ld = LocalDate.of(2000, 3, 1);
        LocalDate ld2 = ld.minusDays(1);
        if (ld2.getDayOfMonth() == 29) {
            System.out.println(ld.getYear() + "是闰年");
        } else {
            System.out.println(ld.getYear() + "不是闰年");
        }

        LocalDate of = LocalDate.of(2001, 1, 1);
        LocalDate of2 = of.minusDays(1);
        if (of2.getDayOfYear() == 366) {
            System.out.println(of2.getYear() + "是闰年");
        } else {
            System.out.println(of2.getYear() + "不是闰年");
        }
    }
}
