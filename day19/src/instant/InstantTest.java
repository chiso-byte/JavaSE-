package instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class InstantTest {
    public static void main(String[] args) {
        // 获取当前时间的Instant对象(标准时间)
        Instant now = Instant.now();
        System.out.println(now);

        // 根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant = Instant.ofEpochSecond(0L);  // 1970.1.1 0:0:0
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochSecond(1L, 1000000000);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochMilli(1000L);
        System.out.println(instant2);

        // 指定时区
        ZonedDateTime time = instant.now().atZone(ZoneId.of("America/Cuiaba"));
        System.out.println(time);

        // isXxx 判断
        boolean before = instant.isBefore(instant1);  // true
        System.out.println(before);

        boolean after = instant.isAfter(instant2);  // false
        System.out.println(after);

        // minusXxx 减少时间系列方法
        Instant instant3 = Instant.ofEpochSecond(0L);
        Instant minus = instant3.minusSeconds(1L);
        System.out.println(minus);

        // plusXxx 增加时间系列方法
        Instant instant4 = instant3.plusSeconds(3L);
        System.out.println(instant4);

    }
}
