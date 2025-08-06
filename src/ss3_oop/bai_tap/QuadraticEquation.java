package ss3_oop.bai_tap;

public class QuadraticEquation {

    private int a, b, c;

    public QuadraticEquation(int a, int b, int c) {
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

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return 2 * this.getB() - 4 * this.getA() * this.getC();
    }

    public double getRoot1() {
        return (-this.getB() + Math.sqrt(Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC()) / (2 * this.getA()));
    }

    public double getRoot2() {
        return (-this.getB() - Math.sqrt(Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC()) / (2 * this.getA()));
    }

    public double getRoot3() {
        return (-this.getB() / 2 * this.getA());
    }

    public String getResult() {
        if (this.getDiscriminant() < 0) {
            return "The equation has no roots";
        } else if (this.getDiscriminant() == 0) {
            return "" + this.getRoot3();
        } else {
            return "x1 = " + this.getRoot1() + "\nx2 = " + this.getRoot2();
        }
    }
}
