package regextest;

import java.util.Arrays;

public class RegexTest7 {
    public static void main(String[] args) {
        /*
        有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
            要求1:把字符串中三个姓名之间的字母替换为vs
            要求2:把字符串中的三个姓名切割出来
            */
        String str = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String newStr = str.replaceAll("\\w+", "vs");
        System.out.println(newStr);

        String[] split = str.split("\\w+");
        System.out.println(Arrays.toString(split));
    }
}
