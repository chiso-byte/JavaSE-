package hw;

public class Test2 {
    public static void main(String[] args) {
        // 求水仙花数
        int calculate = calculate(100, 999, 3);
        System.out.println(calculate);

        System.out.println("=======================");
        // 求两位自幂数
        int calculate1 = calculate(10, 99, 2);
        System.out.println(calculate1);

        System.out.println("========================");
        // 求四叶玫瑰数
        int calculate2 = calculate(1000, 9999, 4);
        System.out.println(calculate2);

        System.out.println("=============================");
        // 求五角星数
        int calculate3 = calculate(10000, 99999, 5);
        System.out.println(calculate3);
    }

    public static int calculate(int start, int end, int power) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int ge = temp % 10;
                sum += Math.pow(ge, power);
                temp /= 10;
            }

            if (i == sum) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }
}
