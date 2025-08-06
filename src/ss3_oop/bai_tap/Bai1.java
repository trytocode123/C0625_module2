package ss3_oop.bai_tap;

public class Bai1 {

    private double a, b, c;

    public Bai1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return 2 * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(b * b - 4 * a * c) / (2 * a));
    }

    public double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * a * c) / (2 * a));
    }

    public double getRoot3() {
        return (-b / 2 * a);
    }

    public double delta() {
        return getDiscriminant();
    }

    public String result() {
        if (delta() < 0) {
            return "The equation has no roots";
        } else if (delta() == 0) {
            return "" + getRoot3();
        } else {
            return "" + getRoot1() + getRoot2();
        }
    }

}
