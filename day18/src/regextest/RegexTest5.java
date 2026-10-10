package regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest5 {
    public static void main(String[] args) {
        String str = " Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台。";

        String regex1 = "Java(?=\\d+)";
        Pattern p = Pattern.compile(regex1);
        Matcher matcher = p.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println("==============================");
        String regex2 = "Java(?:\\d+)";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(str);
        while (m2.find()) {
            System.out.println(m2.group());
        }

        System.out.println("==============================");
        String regex3 = "Java(?!\\d+)";
        Pattern p3= Pattern.compile(regex3);
        Matcher m3 = p3.matcher(str);
        while (m3.find()) {
            System.out.println(m3.group());
        }

    }
}
