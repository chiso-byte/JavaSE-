package homework;

public class HW1 {
    public static void main(String[] args) {
        double min = getMin(6.9, 2.4);
        System.out.println(min);
    }

    public static double getMin(double num1, double num2) {
        return num1 > num2 ? num2 : num1;
    }
}
