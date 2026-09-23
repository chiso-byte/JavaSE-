package homework;

public class HW4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 23, 3, 4, 5, 6, 7};
        int[] arr2 = copyOf(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static int[] copyOf(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
