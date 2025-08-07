package ss3_oop.bai_tap;

public class QuadraticEquation {

    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC();
    }

    public double getRoot1() {
        return (-this.getB() + Math.sqrt(this.getDiscriminant()));
    }

    public double getRoot2() {
        return (-this.getB() - Math.sqrt(this.getDiscriminant()));
    }

    public double getRoot3() {
        return (-this.getB() / 2 * this.getA());
    }

    public String getResult() {
        if (a == 0) {
            return "Not quadratic";
        } else if (this.getDiscriminant() < 0) {
            return "The equation has no roots";
        } else if (this.getDiscriminant() == 0) {
            return "" + this.getRoot3();
        } else {
            return "x1 = " + this.getRoot1() / 2 * this.getA() + "\nx2 = " + this.getRoot2() / 2 * this.getA();
        }
    }
}
