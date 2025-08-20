package ss15_exception;

public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle(int a) {
        this.a = a;
    }

    public Triangle(int a, int b, int c) throws IllTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllTriangleException("Cạnh tam giác phải lớn hơn 0");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllTriangleException("Tổng các cạnh phải lớn hơn cạnh còn lại");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
