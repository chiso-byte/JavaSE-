package hw;

public class HW {
    public static void main(String[] args) {
        Lecture lecture = new Lecture("heima001", "zhangsan", "javase");
        lecture.work();
        lecture.show();

        Tutor tutor = new Tutor();
        tutor.setId("heima002");
        tutor.setName("lisi");
        tutor.setProfession("javaee");
        tutor.work();
        tutor.show();

        Maintainer maintainer = new Maintainer("heima003", "wangwu", "python");
        maintainer.work();
        maintainer.show();

        Buyer buyer = new Buyer("heima004", "zhaoliu", "c++");
        buyer.work();
        buyer.show();
    }
}
