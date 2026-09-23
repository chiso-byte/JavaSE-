package homework;

public class HW10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = copyOfRange(arr, 2, 7);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        for (int i = from, j = 0; i < to; i++) {
            newArr[j++] = arr[i];
        }
        return newArr;
    }
}
