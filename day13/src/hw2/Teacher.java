package hw2;

public class Teacher extends Role{
    private String sectionName;

    @Override
    public void show() {
        super.show();
        System.out.println(", " + sectionName);
    }

    public Teacher() {}

    public Teacher(String name, int age, String sectionName) {
        super(name, age);
        this.sectionName = sectionName;
    }

    public void publishForm() {
        System.out.println("老师发布问题");
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }
}
