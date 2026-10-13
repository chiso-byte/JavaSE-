package test;

import simpledateformat.SimpleDateFormatTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        /* 需求:
            秒杀活动开始时间:2023年11月11日 0:0:0(毫秒值)
            秒杀活动结束时间:2023年11月11日 0:10:0(毫秒值)

            小贾下单并付款的时间为:2023年11月11日 0:01:0
            小皮下单并付款的时间为:2023年11月11日 0:11:0
            用代码说明这两位同学有没有参加上秒杀活动?
         */
        String startTime = "2023年11月11日 0:0:0";
        String endTime = "2023年11月11日 0:10:0";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date start = sdf.parse(startTime);
        Date end = sdf.parse(endTime);
        long st = start.getTime();
        long et = end.getTime();

        String str1 = "2023年11月11日 0:01:0";
        Date str1Date = sdf.parse(str1);
        long l1 = str1Date.getTime();
        if (l1 >= st && l1 <= et) {
            System.out.println("小贾同学参与秒杀成功");
        } else {
            System.out.println("参与失败");
        }

        String str2 = "2023年11月11日 0:11:0";
        Date str2Date = sdf.parse(str2);
        long l2= str2Date.getTime();
        if (l2 >= st && l2 <= et) {
            System.out.println("小皮同学参与秒杀成功");
        } else {
            System.out.println("参与失败");
        }

    }
}
