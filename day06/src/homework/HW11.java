package homework;

import java.util.Random;

public class HW11 {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        boolean[] arr2 = new boolean[arr.length];
        Random r = new Random();
        for (int i = 0; i < arr.length;) {
            int randomIndex = r.nextInt(arr.length);
            if (!arr2[randomIndex]) {
                int choose = arr[randomIndex];
                arr2[randomIndex] = true;
                i++;
                System.out.println(choose + "元的奖金被抽出");
            }
        }
    }
}
