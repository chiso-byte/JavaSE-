import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入税前工资");
        int income = sc.nextInt();
        // 记录扣除三险一金后的工资
        double deposit = income - income * 0.1;
        // 如果税前收入扣除10%的三险一金, 且应该交税的金额
        double rest = income - income * 0.1 - 5000;
        // 纳税数额
        double tax = 0;

        // 如果一个人的交个税的部分是5000
        if (rest > 0 && rest <= 3000) {
            tax = rest * 0.03;
        } else if (rest > 3000 && rest <= 12000) {
            tax = (rest - 3000) * 0.1 + 3000 * 0.03;
        } else if (rest > 12000 && rest <= 25000) {
            tax = (rest - 12000) * 0.2 + (12000 - 3000) * 0.1 + 3000 * 0.03;
        } else if (rest > 25000 && rest <= 35000) {
            tax = (rest - 25000) * 0.25 + (25000 - 12000) * 0.2 + (12000 - 3000) * 0.1 + 3000 * 0.03;
        } else if (rest > 35000 && rest <= 55000) {
            tax = (rest - 35000) * 0.3 + (35000 - 25000) * 0.25 + (25000 - 12000) * 0.2 + (12000 - 3000) * 0.1 + 3000 * 0.03;
        } else if (rest > 55000 && rest <= 80000) {
            tax = (rest - 55000) * 0.35 + (55000 - 35000) * 0.3 + (35000 - 25000) * 0.25 + (25000 - 12000) * 0.2 + (12000 - 3000) * 0.1 + 3000 * 0.03;
        } else if (rest > 80000) {
            tax = (rest - 80000) * 0.45 + (80000 - 55000) * 0.35 +  (55000 - 35000) * 0.3 + (35000 - 25000) * 0.25 + (25000 - 12000) * 0.2 + (12000 - 3000) * 0.1 + 3000 * 0.03;
        }
        deposit -= tax;
        System.out.println("应纳税的数额为：" + tax);
        System.out.println("税后工资为：" + deposit);
    }
}
