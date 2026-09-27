package hw3;

public class HW3 {
    public static void main(String[] args) {
        GirlFriend[] gf = new GirlFriend[4];
        GirlFriend gf1 = new GirlFriend("小灰灰", 18, "女", "打篮球");
        GirlFriend gf2 = new GirlFriend("小香香", 19, "女", "踢足球");
        GirlFriend gf3 = new GirlFriend("小甜甜", 20, "女", "唱歌");
        GirlFriend gf4 = new GirlFriend("小萌萌", 21, "女", "看书");
        gf[0] = gf1;
        gf[1] = gf2;
        gf[2] = gf3;
        gf[3] = gf4;
        int sum = 0;
        for (int i = 0; i < gf.length; i++) {
            GirlFriend girlFriend = gf[i];
            sum += girlFriend.getAge();
        }
        int avg = sum / gf.length;
        System.out.println("avg = " + avg);

        int count = 0;
        for (int i = 0; i < gf.length; i++) {
            GirlFriend girlFriend = gf[i];
            if (girlFriend.getAge() < avg) {
                System.out.println(girlFriend.getName() + ", " + girlFriend.getAge() + ", " + girlFriend.getGender() + ", " + girlFriend.getHobby());
                count++;
            }
        }
        System.out.println(count);
    }
}
