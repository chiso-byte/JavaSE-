package zonedatetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeTest {
    public static void main(String[] args) {
        // 通过静态方法获取对象
        ZonedDateTime zdt1 = ZonedDateTime.now();
        System.out.println(zdt1);

        // 通过Instant+时区的方式指定获取事件对象
        Instant instant = Instant.ofEpochSecond(0L);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zdt2 = instant.atZone(zoneId);
        System.out.println(zdt2);

        // withXxx 修改时间系列的方法
        ZonedDateTime zdt3 = zdt2.withYear(2000);
        System.out.println(zdt3);

        // minusXxx 减少时间
        ZonedDateTime zdt4 = zdt3.minusSeconds(1L);
        System.out.println(zdt4);

        // plusXxx 增加时间
        ZonedDateTime zdt5 = zdt3.plusSeconds(3L);
        System.out.println(zdt5);


    }
}
