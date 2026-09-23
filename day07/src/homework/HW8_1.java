package homework;

import java.util.Random;

public class HW8_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 588, 888, 100, 10000};
        int[] bonus = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < arr.length;) {
            int randomIndex = r.nextInt(arr.length);
            int choose = arr[randomIndex];
            if (!contains(choose, bonus)) {
                bonus[i] = choose;
                i++;
            }
        }
        for (int i = 0; i < bonus.length; i++) {
            System.out.print(bonus[i] + " ");
        }
    }

    public static boolean contains(int choose, int[] bonus) {
        for (int i = 0; i < bonus.length; i++) {
            if (choose == bonus[i])
                return true;
        }
        return false;
    }
}
