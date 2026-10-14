package quicksort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,1, 6, 2, 7, 9, 3, 4, 5, 1,10, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int i = l, j = r;
        int x = arr[l];
        while (i < j) {
            while (i < j && x <= arr[j]) j--;
            while (i < j && x >= arr[i]) i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        arr[l] = arr[i];
        arr[i] = x;
        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }
}
