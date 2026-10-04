package hw5;

public class HW {
    public static void main(String[] args) {
        InterAImp interAImp = new InterAImp();
        A a = new A();
        a.method(interAImp);

        a.method(new InterA() {
            @Override
            public void showA() {
                System.out.println("匿名内部类重写showA方法");
            }
        });
    }
}

interface InterA {
    void showA();
}

class A {
    public void method(InterA a) {
        a.showA();
    }
}

class InterAImp implements InterA {
    @Override
    public void showA() {
        System.out.println("实现类重写showA方法");
    }
}
