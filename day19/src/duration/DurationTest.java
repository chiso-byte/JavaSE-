package duration;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {
    public static void main(String[] args) {
        // 秒 毫秒 纳秒
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime of = LocalDateTime.of(2000, 1, 1, 0, 0, 0);
        System.out.println(of);

        Duration between = Duration.between(of, now);
        System.out.println(between);
        System.out.println(between.toDays());
        System.out.println(between.toHours());
        System.out.println(between.toMinutes());
        System.out.println(between.toMillis());
        System.out.println(between.toNanos());
    }
}
