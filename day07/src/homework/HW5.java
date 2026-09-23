package homework;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        int[] scores = getScores();
        int max = getMax(scores);
        int min = getMin(scores);
        int sum = getSum(scores);
        int avg = (sum - min - max) / (scores.length - 2);
        System.out.println(avg);

    }

    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6;) {
            System.out.println("请输入第" + (i + 1) + "个评委的成绩：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出范围");
            }
        }
        return scores;
    }

    public static int getMax(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scores) {
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (min > scores[i]) {
                min = scores[i];
            }
        }
        return min;
    }

    public static int getSum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }
}
