package homework;

public class HW4 {
    public static void main(String[] args) {
        System.out.println(getAbs(3.7));
        System.out.println(getAbs(-3.7));
    }

    public static double getAbs(double n) {
        if (n < 0) return -n;
        return n;
    }
}
