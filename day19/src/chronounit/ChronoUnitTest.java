package chronounit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime of = LocalDateTime.of(2000, 1, 1, 0, 0, 0);

        System.out.println(ChronoUnit.YEARS.between(of, now));
        System.out.println(ChronoUnit.MONTHS.between(of, now));
        System.out.println(ChronoUnit.DAYS.between(of, now));
        System.out.println(ChronoUnit.WEEKS.between(of, now));
        System.out.println(ChronoUnit.DAYS.between(of, now));
        System.out.println(ChronoUnit.HOURS.between(of, now));
        System.out.println(ChronoUnit.MINUTES.between(of, now));
        System.out.println(ChronoUnit.SECONDS.between(of, now));
        System.out.println(ChronoUnit.MILLIS.between(of, now));
        System.out.println(ChronoUnit.MICROS.between(of, now));
        System.out.println(ChronoUnit.NANOS.between(of, now));
        System.out.println(ChronoUnit.HALF_DAYS.between(of, now));
        System.out.println(ChronoUnit.DECADES.between(of, now));
        System.out.println(ChronoUnit.CENTURIES.between(of, now));
        System.out.println(ChronoUnit.MILLENNIA.between(of, now));
        System.out.println(ChronoUnit.ERAS.between(of, now));

    }
}
