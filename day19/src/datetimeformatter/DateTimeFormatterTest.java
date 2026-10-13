package datetimeformatter;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        ZonedDateTime time = ZonedDateTime.now();
        // 获取DateTimeFormatter对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        // 格式化时间对象
        System.out.println(dtf.format(time));
    }
}
