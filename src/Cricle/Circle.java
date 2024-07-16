package Cricle;

public class Circle {

    private int id;
    private double radius;
    private static int count = 0;
    private static double maxRadius = 0.0;
    public static final double PI = 3.14159265358979323846;

    public Circle(int id, double radius) {
        this.id = count++;
        this.radius = radius;
        if (radius > maxRadius) {
            maxRadius = radius;
        }

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public double getArea() {
        return PI * radius * radius;

    }

    public static int getCount() {
        return count;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }
    public static double getMaxRadius() {
        return maxRadius;
    }

}

