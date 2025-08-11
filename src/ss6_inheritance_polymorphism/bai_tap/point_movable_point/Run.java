package ss6_inheritance_polymorphism.bai_tap.point_movable_point;


public class Run {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1.1f, 2.2f, 3.3f, 4.4f);
        System.out.println(mp.move());
    }
}
