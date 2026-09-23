public class HW12 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1949; i <= 2019; i ++) {
            if ((2019 - i) % 12 == 0) {
                System.out.println(i);
                count ++;
            }
        }
        System.out.println(count);
    }
}
