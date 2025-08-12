package ss7_interface_abstract.bai_tap.bai_tap_1;

public class Circle extends Shape implements IResizable {
    private double radius = 1.0;


    public Circle() {
    }

    @Override
    double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resizable(double percent) {
        System.out.println(getArea() * percent + getArea() * percent / 100);
    }
}
