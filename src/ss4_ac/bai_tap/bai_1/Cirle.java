package ss4_ac.bai_tap.bai_1;

public class Cirle {
    private double radius = 1.0;
    private String color = "red";
    final static double PI = 3.1415;

    public Cirle() {

    }

    public Cirle(double radius) {
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

    public double getArea() {
        return getRadius() * PI;
    }

    @Override
    public String toString() {
        return "Cirle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
