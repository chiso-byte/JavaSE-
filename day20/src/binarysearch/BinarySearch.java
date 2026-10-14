package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        //二分查找/折半查找
        //核心：
        //每次排除一半的查找范围

        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下：{7, 23, 79, 81, 103, 127, 131, 147}
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        System.out.println(binarySearch(arr, 103));
    }

    public static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            int temp = arr[mid];
            if (temp > x) {
                r = mid - 1;
            } else if (temp < x) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
