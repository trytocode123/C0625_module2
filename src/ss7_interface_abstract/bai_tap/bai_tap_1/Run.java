package ss7_interface_abstract.bai_tap.bai_tap_1;

public class Run {

    private final static Shape[] shapeList = new Shape[100];

    static {
        shapeList[0] = new Circle(5, "yellow");
        shapeList[1] = new Rectangle(5, 5, "red");
    }

    public static void main(String[] args) {
        System.out.println("Diện tích trước khi resize");
        for (Shape shape : shapeList) {
            if (shape != null) {
                System.out.println(shape.getArea());
            }
        }

        System.out.println("Diện tích sau khi resize");
        for (Shape value : shapeList) {
            if (value instanceof Circle) {
                ((Circle) value).resizable(50);
            } else if (value instanceof Rectangle) {
                ((Rectangle) value).resizable(100);
            }
        }
    }
}
