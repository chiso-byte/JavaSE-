package hw1;

public class Round extends Shape{
    private int radius;
    private final double PI = 3.14;

    public Round() {
    }

    public Round(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public int getArea() {
        return (int)(PI * radius * radius);
    }

    @Override
    public int getLen() {
        return (int)(2 * PI * radius);
    }
}
