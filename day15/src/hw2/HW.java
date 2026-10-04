package hw2;

public class HW {
    public static void main(String[] args) {
        OldPhone op = new OldPhone();
        usePhone(op);

        System.out.println("==================");
        NewPhone np = new NewPhone();
        usePhone(np);
    }

    public static void usePhone(Phone phone) {
        if (phone instanceof NewPhone np) {
            np.call();
            np.sendMessage();
            np.playGame();
        } else if (phone instanceof OldPhone) {
            OldPhone op = (OldPhone) phone;
            op.call();
            op.sendMessage();
        } else {
            System.out.println("类型错误");
        }
    }
}
