package homework;

public class HW4 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        System.out.println(num);
    }
}
