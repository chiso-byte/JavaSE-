package hw4;

import java.util.ArrayList;
import java.util.Scanner;

public class BookSystem {
    ArrayList<Book> list = new ArrayList<>();

    public void show() {
        System.out.println("===========欢迎来到图书管理系统==========");
        System.out.println("1. 添加图书信息");
        System.out.println("2. 显示所有图书");
        System.out.println("3. 查询图书信息");
        System.out.println("4. 删除图书信息");
        System.out.println("5. 修改图书信息");
        System.out.println("6. 退出系统");
        System.out.print("请输入您的选择: ");
        Scanner sc = new Scanner(System.in);
        String choose = sc.next();
        switch (choose) {
            case "1" -> addBook(list);
            case "2" -> showAllBook(list);
            case "3" -> showBook(list);
            case "4" -> deleteBook(list);
            case "5" -> updateBook(list);
            case "6" -> {
                System.out.println("已退出图书管理系统,欢迎再次使用");
                System.exit(0);
            }
            default -> System.out.println("没有这个选项,请重新输入");
        }
    }

    public void updateBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要修改的图书id");
            String id = sc.next();
            int index = IdToIndex(id, list);
            if (index == -1) {
                System.out.println("当前图书" + id + "不存在,请重新输入id");
            } else {
                Book book = list.get(index);
                System.out.println("请输入新的书名");
                String newName = sc.next();
                book.setName(newName);
                System.out.println("请输入新的作者");
                String newAuthor = sc.next();
                book.setAuthor(newAuthor);
                System.out.println("请输入新的价格");
                double price = sc.nextDouble();
                book.setPrice(price);
                System.out.println("图书修改成功");
                break;
            }
        }
    }

    public void deleteBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要删除的图书编号");
            String id = sc.next();
            int index = IdToIndex(id, list);
            if (index == -1) {
                System.out.println("当前图书" + id + "不存在,请重新输入id");
            } else {
                Book book = list.get(index);
                list.remove(book);
                System.out.println("该图书已被删除");
                showAllBook(list);
                break;
            }
        }
    }

    public void showBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请要查询的图书id");
            String id = sc.next();
            int index = IdToIndex(id, list);
            if (index == -1) {
                System.out.println("当前图书" + id + "不存在,请重新输入id");
            } else {
                Book b = list.get(index);
                System.out.println("图书的编号为: " + b.getId() + ", 图书的书名为: " + b.getName()
                        + ", 图书的作者为: " + b.getAuthor() + ", 图书的价格为: " + b.getPrice());
                break;
            }
        }
    }

    public int IdToIndex(String id, ArrayList<Book> list) {
        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            if (book.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void showAllBook(ArrayList<Book> list) {
        if (list.size() == 0) {
            System.out.println("当前暂无图书信息,请先添加后再使用");
            return;
        }
        System.out.println("id\t\t\t书名\t\t\t作者\t\t\t价格");
        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getAuthor() + "\t" + book.getPrice());
        }
    }

    public void addBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();

        while (true) {
            System.out.println("请输入图书的编号");
            String id = sc.next();
            if (contains(id, list)) {
                System.out.println("该图书" + id + "已存在,请修改id后再添加");
            } else {
                book.setId(id);
                System.out.println("该图书" + id + "不存在,可以添加,继续录入下面的信息");
                break;
            }
        }
        System.out.println("请输入图书的书名");
        String name = sc.next();
        book.setName(name);
        System.out.println("请输入图书的作者");
        String author = sc.next();
        book.setAuthor(author);
        System.out.println("请输入图书的价格");
        double price = sc.nextDouble();
        book.setPrice(price);
        list.add(book);
        System.out.println("添加成功");
    }

    public boolean contains(String id, ArrayList<Book> list) {
        return IdToIndex(id, list) >= 0;
    }
}
