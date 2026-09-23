package homework;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要插入的数字");
        int insertNum = sc.nextInt();
        int[] arr2 = new int[arr.length + 1];
        int index = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > insertNum) {
                index = i;
                break;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i < index) {
                arr2[i] = arr[i];
            } else if (i == index) {
                arr2[i] = insertNum;
            } else {
                arr2[i] = arr[index];
                index++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
