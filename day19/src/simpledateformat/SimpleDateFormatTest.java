package simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        // SimpleDateFormat 按照指定格式将Date对象转换为String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat();  // 默认是以这种格式进行输出: 2026/10/11 上午12:08
        Date date = new Date();
        String dateTime = sdf.format(date);

        System.out.println(sdf2.format(date));
        System.out.println(dateTime);

        // 可以将String解析成对应的Date对象
        // 如果解析的格式不正确会报错
        String str = "2023年8月13日 13:52:03";
        Date date2 = sdf.parse(str);
        System.out.println(date2);
    }
}
