package hw6;

public class HW6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(printArr(arr));
    }

    public static String printArr(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append(']');
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }
}
