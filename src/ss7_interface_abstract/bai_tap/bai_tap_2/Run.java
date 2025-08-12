package ss7_interface_abstract.bai_tap.bai_tap_2;

import ss7_interface_abstract.bai_tap.bai_tap_1.Rectangle;

public class Run {

    private final static Shape[] shapeList = new Shape[100];

    static {
        shapeList[0] = new Circle(5, "yellow");
        shapeList[1] = new Square(5, 5, "red");
    }

    public static void main(String[] args) {
        for (Shape shape : shapeList) {
            if (shape instanceof IColorable) {
                ((IColorable) shape).howtoColor();
            }
        }
    }
}
