package hw4;

public class HW4 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);
        students[0] = stu1;
        students[1] = stu2;
        students[2] = stu3;

        Student stu4 = new Student(4, "zhaoliu", 26);
        if (contains(students, stu4.getId())) {
            System.out.println("当前的学号已存在, 请修改学号后再添加");
        } else {
            int count = getCount(students);
            if (count == students.length) {
                Student[] newArr = createNewArr(students);
                newArr[count] = stu4;
                students = newArr;
                printArr(newArr);
            } else {
                students[count] = stu4;
                printArr(students);
            }
        }

        System.out.println("===============================");
        int index = getIdToIndex(students, 3);
        if (index >= 0) {
            students[index] = null;
            printArr(students);
        } else {
            System.out.println("该学号不存在, 无法删除");
        }

        index = getIdToIndex(students, 2);
        if (index >= 0) {
            Student student = students[index];
            int newAge = student.getAge() + 1;
            student.setAge(newAge);
        }
        System.out.println("================================");
        printArr(students);

    }

    public static int getIdToIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if (student != null) {
                int sid = student.getId();
                if (sid == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean contains(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student != null) {
                int sid = student.getId();
                if (sid == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getCount(Student[] students) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student != null) {
                count++;
            }
        }
        return count;
    }

    public static Student[] createNewArr(Student[] students) {
        Student[] newArr = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newArr[i] = students[i];
        }
        return newArr;
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if (student != null) {
                System.out.println(student.getId() + ", " + student.getName() + ", " + student.getAge());
            }
        }
    }
}
