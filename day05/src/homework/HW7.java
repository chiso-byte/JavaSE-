package homework;

public class HW7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        for (int i = 0, j = arr.length - 1; i < j;) {
            while (i < j && arr[i] % 2 == 1) i++;
            while (i < j && arr[j] % 2 == 0) j--;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
