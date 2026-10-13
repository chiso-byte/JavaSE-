package zoneid;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdTest {
    public static void main(String[] args) {
        // 获取所有时区
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        // 获取系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        // 获得指定的时区
        ZoneId zoneId1 = ZoneId.of("America/Cuiaba");
        System.out.println(zoneId1);
    }
}
