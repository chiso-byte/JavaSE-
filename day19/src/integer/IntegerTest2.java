package integer;

public class IntegerTest2 {
    public static void main(String[] args) {
        String str = Integer.toBinaryString(100);
        System.out.println(str);

        String str2 = Integer.toOctalString(100);
        System.out.println(str2);

        String str3 = Integer.toHexString(100);
        System.out.println(str3);

        int i = Integer.parseInt("213");
        System.out.println(i);
        System.out.println(i + 1);

        String str4 = "true";
        boolean b = Boolean.parseBoolean(str4);
        System.out.println(b && false);
    }
}
