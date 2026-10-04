package hw6;

public class HW {
    public static void main(String[] args) {
        B b = new B(new InterB() {
            @Override
            public void showB() {
                System.out.println("匿名内部类重写了showB方法");
            }
        });
        b.methodB();
    }
}

interface InterB {
    void showB();
}

class B {
    InterB b;
    public B(InterB b) {
        this.b = b;
    }

    public void methodB() {
        b.showB();
    }
}
