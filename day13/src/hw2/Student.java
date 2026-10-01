package hw2;

public class Student extends Role{
    private String className;

    @Override
    public void show() {
        super.show();
        System.out.println(", " + className);
    }

    public Student() {}

    public Student(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    public void fillForm() {
        System.out.println("学生填写听课反馈");
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
