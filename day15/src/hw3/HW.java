package hw3;

public class HW {
    public static void main(String[] args) {
        IPlayIml ipi = new IPlayIml();
        ipi.playGame();

        new IPlay() {
            @Override
            public void playGame() {
                System.out.println("匿名内部类的playGame方法");
            }
        }.playGame();


        Son s = new Son();
        s.fun();

        new Fun() {
            @Override
            public void fun() {
                System.out.println("匿名内部类重写fun方法");
            }
        }.fun();
    }
}
