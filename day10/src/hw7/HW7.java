package hw7;


public class HW7 {
    public static void main(String[] args) {
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        int count = 0;
        while (true) {
            int index = str.indexOf("Java");
            if (index == -1) {
                break;
            }
            count++;
            if (index + 4 >= str.length()) {
                break;
            }
            str = str.substring(index + 4);
        }
        System.out.println(count);
    }
}
