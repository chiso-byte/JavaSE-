package hw2;

public class HW {
    public static void main(String[] args) {
        Student student = new Student("zhangsan", 13, "1班");
        student.show();
        student.showTable();
        student.fillForm();

        Teacher teacher = new Teacher("lisi", 34, "教研部");
        teacher.show();
        teacher.showTable();
        teacher.publishForm();
    }
}
