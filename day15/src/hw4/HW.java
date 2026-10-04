package hw4;

public class HW {
    public static void main(String[] args) {
        Outer.method().show();
    }
}

interface Inter {
    public abstract void show();
}

class Outer {
    public static Inter method() {
        Inter inter = new Inter() {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
        return inter;
    }
}
