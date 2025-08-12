package ss7_interface_abstract.bai_tap.bai_tap_2;

public abstract class Shape {
    String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
