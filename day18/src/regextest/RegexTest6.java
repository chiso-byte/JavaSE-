package regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest6 {
    public static void main(String[] args) {
        String s = "Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa" +
                "经历了很多版木，目前企业中用的最多的是]ava8和]ava11，因为这两个是长期支持版木。" +
                "下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        // + 和 * 默认是贪婪爬取
//        Pattern p = Pattern.compile("ab+");
        // 非贪婪爬取需要在数量词后面加?
        Pattern p = Pattern.compile("ab+?");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
