package hw1;

public class HW {
    public static void main(String[] args) {
        Round round = new Round(3);
        System.out.println(round.getRadius());
        System.out.println(round.getArea());
        System.out.println(round.getLen());

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.getHeight() + ", " + rectangle.getWidth());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getLen());
    }
}
