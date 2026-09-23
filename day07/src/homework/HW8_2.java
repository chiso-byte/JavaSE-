package homework;

import java.util.Random;

public class HW8_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 588, 888, 100, 10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
