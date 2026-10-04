package hw2;

public class NewPhone extends Phone implements IPlay{
    @Override
    public void playGame() {
        System.out.println("新手机可以玩游戏");
    }
}
