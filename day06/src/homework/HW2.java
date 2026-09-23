package homework;

public class HW2 {
    public static void main(String[] args) {
        int max = getMax(1, 8, 3);
        System.out.println(max);
    }

    public static int getMax(int num1, int num2, int num3) {
        int temp = num1 > num2 ? num1 : num2;
        int max = temp > num3 ? temp : num3;
        return max;
    }
}
