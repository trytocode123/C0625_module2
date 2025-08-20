package ss15_exception;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Nhập cạnh a: ");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập cạnh b: ");
                int b = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập cạnh c: ");
                int c = Integer.parseInt(sc.nextLine());
                new Triangle(a, b, c);
                flag = false;
            } catch (IllTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi nhập chuỗi");
            }
        }
    }
}
