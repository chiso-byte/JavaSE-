package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test6 {
    public static void main(String[] args) throws ParseException {
        // JDK7
        String str = "2003年8月14日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthday = sdf.parse(str);
        long today = System.currentTimeMillis();
        System.out.println((today - birthday.getTime()) / 1000 / 60 / 60 / 24);


        // JDK8 LocalDate
        LocalDate ld = LocalDate.now();
        LocalDate of = LocalDate.of(2003, 8, 14);
        System.out.println(ChronoUnit.DAYS.between(of, ld));
    }
}
