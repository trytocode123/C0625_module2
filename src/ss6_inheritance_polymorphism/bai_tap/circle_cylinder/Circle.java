package ss6_inheritance_polymorphism.bai_tap.circle_cylinder;

public class Circle {
    protected double radius;
    protected String color;
    final static double PI = 3.1415;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    double getArea() {
        return radius * PI;
    }

    @Override
    public String toString() {
        return
                " radius= " + radius + ", color = " + color + ","
                ;
    }
}
