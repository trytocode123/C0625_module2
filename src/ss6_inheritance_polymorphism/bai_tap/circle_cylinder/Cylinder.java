package ss6_inheritance_polymorphism.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    double h;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double h) {
        super(radius, color);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    double getVolume() {
        return 2 * Circle.PI * super.getRadius() * h;
    }

    @Override
    public String toString() {
        return "Cylinder" + super.toString() + " Volume = " +  getVolume();
    }
}
