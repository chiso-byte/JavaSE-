package blocksearch;

import java.util.ArrayList;

public class BlockSearch {
    public static void main(String[] args) {
        /*
            分块查找
            核心思想：
                块内无序，块间有序
            实现步骤：
                1.创建数组blockArr存放每一个块对象的信息
                2.先查找blockArr确定要查找的数据属于哪一块
                3.再单独遍历这一块数据即可
        */

        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        Block block1 = new Block(21, 0, 5);
        Block block2 = new Block(45, 6, 11);
        Block block3 = new Block(73, 12, 17);
        Block[] blocks = {block1, block2, block3};

        System.out.println(blockSearch(blocks, arr, 52));
    }

    private static int blockSearch(Block[] blocks, int[] arr, int x) {
        int index = innerSearch(blocks, x);
        int startIndex = blocks[index].getStartIndex();
        int endIndex = blocks[index].getEndIndex();
        for (int i = startIndex; i < endIndex; i++) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int innerSearch(Block[] blocks, int x) {
        int l = 0, r = blocks.length - 1;
        while (l <= r) {
            int mid = l + r >> 1;
            int temp = blocks[mid].getMax();
            if (temp < x) {
                l = mid + 1;
            } else if (temp > x) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
        return l;
    }
}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public Block() {
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
