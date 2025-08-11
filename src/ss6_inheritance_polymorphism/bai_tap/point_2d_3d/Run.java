package ss6_inheritance_polymorphism.bai_tap.point_2d_3d;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1.2f, 3.4f);
        Point3D point3D = new Point3D(1.2f, 3.4f, 5.5f);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
