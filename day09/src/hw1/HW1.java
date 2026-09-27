package hw1;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            Car car = new Car();
            System.out.println("请输入汽车的品牌");
            String brand = sc.next();
            car.setBrand(brand);
            System.out.println("请输入汽车的价格");
            int price = sc.nextInt();
            car.setPrice(price);
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            car.setColor(color);
            cars[i] = car;
        }
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println(car.getBrand() + ", " + car.getPrice() + ", " + car.getColor());
        }

    }
}
