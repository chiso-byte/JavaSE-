package homework;

public class HW6 {
    public static void main(String[] args) {
        int number = 1983;
        int len = getLen(number);
        int[] arr = getArr(number, len);

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10;
        }

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result * 10 + arr[i];
        }

        System.out.println(result);
    }

    public static int getLen(int number) {
        int len = 0;
        while (number > 0) {
            len++;
            number /= 10;
        }
        return len;
    }

    public static int[] getArr(int number, int len) {
        int[] arr = new int[len];
        while (number > 0) {
            int ge = number % 10;
            arr[--len] = ge;
            number /= 10;
        }
        return arr;
    }

}
