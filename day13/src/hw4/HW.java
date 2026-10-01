package hw4;

public class HW {
    public static void main(String[] args) {
        Student student = new Student("zhangsan", "girl", 14, "China", "金华", "1 class");
        student.work();

        Worker worker = new Worker("lisi", "boy", 23, "China", "安华", 4);
        worker.work();

        StudentLeader sl = new StudentLeader("wangwu", "boy", 33, "China", "金华", "2 class", "主席");
        sl.work();
        sl.meeting();
    }
}
