package hw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentSys {
    ArrayList<Student> list = new ArrayList<>();

    public void show() {
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作1登录 2注册 3忘记密码 4退出");
        Scanner sc = new Scanner(System.in);
        String choose = sc.next();
        switch (choose) {
            case "1" -> login(list);
            case "2" -> register(list);
            case "3" -> forgetPassword(list);
            case "4" -> {
                System.out.println("退出系统");
                System.exit(0);
            }
            default -> System.out.println("没有这个选项,请重新输入");
        }
    }

    public void forgetPassword(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        int index = usernameToIndex(username, list);
        if (index == -1) {
            System.out.println("用户名" + username + "未注册,请先注册");
            return;
        }
        while (true) {
            System.out.println("请输入身份证号码");
            String personId = sc.next();
            System.  out.println("请输入手机号码");
            String phone = sc.next();
            Student student = list.get(index);
            if (!(student.getPersonId().equals(personId) && student.getPhone().equals(phone))) {
                System.out.println("账号信息不匹配,修改失败");
            } else {
                System.out.println("请输入密码");
                String password = sc.next();
                student.setPassword(password);
                System.out.println("修改成功");
                break;
            }
        }
    }

    private int usernameToIndex(String username, ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    public void login(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while (cnt < 3) {
            System.out.println("请输入用户名: ");
            String username = sc.next();
            if (!containsUsername(username, list)) {
                System.out.println("用户名" + username + "未注册,请先注册");
                return;
            }
            System.out.println("请输入密码: ");
            String password = sc.next();

            while (true) {
                String rightCode = generateCode();
                System.out.println("验证码为: " + rightCode);
                System.out.println("请输入验证码: ");
                String code = sc.next();
                if (!rightCode.equalsIgnoreCase(code)) {
                    System.out.println("验证码输入有误,请重新输入");
                } else {
                    break;
                }
            }

            Student student = new Student(username, password, null, null);
            if (!contains(student, list)) {
                System.out.println("用户名或密码输入有误,请重新输入");
                cnt++;
                if (cnt == 2) {
                    System.out.println("账号" + username + "已被锁定");
                }
            } else {
                System.out.println("登录成功");
                return;
            }
        }
    }

    private String generateCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(list.size());
            sb.append(list.get(i));
        }
        int randomNum = r.nextInt(10);
        sb.append(randomNum);
        char[] chars = sb.toString().toCharArray();
        int randomIndex = r.nextInt(chars.length);
        char temp = chars[randomIndex];
        chars[randomIndex] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;
        return new String(chars);
    }

    public boolean containsUsername(String username, ArrayList<Student> list) {
        return usernameToIndex(username, list) >= 0;
    }

    private boolean contains(Student student, ArrayList<Student> list) {
        String username = student.getUsername();
        String password = student.getPassword();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String rightUsername = stu.getUsername();
            String rightPassword = stu.getPassword();
            if (rightUsername.equals(username) && rightPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void printList(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getUsername() + ", " + student.getPassword() + ", " +
                    student.getPersonId() + ", " + student.getPhone());
        }
    }

    public void register(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        while (true) {
            System.out.println("请输入用户名");
            String username = sc.next();
            if (!checkUsername(username)) {
                System.out.println("输入的用户名不合法,请重新输入");
            } else {
                student.setUsername(username);
                System.out.println("用户名录入成功,继续录入下面的数据");
                break;
            }
        }
        while (true) {
            System.out.println("请输入密码");
            String password = sc.next();
            System.out.println("请再次输入密码");
            String againPassword = sc.next();
            if (!password.equals(againPassword)) {
                System.out.println("两次输入的密码不一致,请重新输入密码");
            } else {
                student.setPassword(password);
                System.out.println("密码录入成功,继续录入下面的数据");
                break;
            }
        }

        while (true) {
            System.out.println("请输入身份证号码");
            String personId = sc.next();
            if (!checkPersonId(personId)) {
                System.out.println("输入的身份证号码不合法,请重新输入");
            } else {
                student.setPersonId(personId);
                System.out.println("身份证号码录入成功,继续录入下面的数据");
                break;
            }
        }

        while (true) {
            System.out.println("请输入手机号码");
            String phone = sc.next();
            if (!checkPhone(phone)) {
                System.out.println("输入的手机号码不合法,请重新输入");
            } else {
                student.setPhone(phone);
                System.out.println("手机号码录入成功");
                break;
            }
        }

        list.add(student);
        System.out.println("添加成功");

        printList(list);
    }

    private boolean checkPhone(String phone) {
        if (phone.length() != 11) {
            return false;
        }
        if (phone.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < phone.length(); i++) {
            char c = phone.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    private boolean checkPersonId(String personId) {
        if (personId.length() != 18) {
            return false;
        }
        if (personId.startsWith("0")) {
            return false;
        }

        for (int i = 0; i < personId.length() - 1; i++) {
            char c = personId.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        char c = personId.charAt(personId.length() - 1);
        if (c == 'X' || c == 'x' || c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    public boolean checkUsername(String username) {
        if (username.length() < 3 || username.length() > 15) {
            return false;
        }

        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')) {
                return false;
            }
        }

        int capNum = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                capNum++;
                return true;
            }
        }
        return false;
    }
}
