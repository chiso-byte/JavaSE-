package homework;

public class HW1 {
    public static void main(String[] args) {
        int fatherHeight = 177;
        int motherHeight = 165;
        double sonHeight = (fatherHeight + motherHeight) * 1.08 / 2;
        double daughterHeight = (fatherHeight * 0.923 + motherHeight) / 2;
        System.out.println("儿子的身高是：" + sonHeight);
        System.out.println("女儿的身高是：" + daughterHeight);
    }
}
