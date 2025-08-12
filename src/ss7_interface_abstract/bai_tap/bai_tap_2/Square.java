package ss7_interface_abstract.bai_tap.bai_tap_2;

public class Square extends Shape implements IColorable {
    private double width = 1.0;
    private double length = 1.0;

    public Square() {
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    public Square(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double getPerimeter() {
        return 2 * (width + this.length);
    }


    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howtoColor() {
        System.out.println("Color all four sides");
    }
}
