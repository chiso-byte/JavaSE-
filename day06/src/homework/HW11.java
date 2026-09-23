package homework;

import java.util.Random;

public class HW11 {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        // 开辟一个新数组记录每次抽取的奖金
        int[] arr2 = new int[arr.length];
        // 每次数组抽取前都与新数组里的值进行比较
        for (int i = 0; i < arr.length; i++) {
            int chooseNum = choose(arr, arr2);
            System.out.println(chooseNum + "元的奖金被抽出");
        }
    }

    public static int choose(int[] arr, int[] arr2) {
        Random r = new Random();
        while (true) {
            int randomIndex = r.nextInt(arr.length);
            int chooseNum = arr[randomIndex];

            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] == 0) {
                    // 如果还未出现就抽它
                    arr2[i] = chooseNum;
                    return chooseNum;
                }
                if (arr2[i] == chooseNum) {
                    // 如果已经出现了就换一个随机索引来抽
                    break;
                }
            }
        }
    }
}
