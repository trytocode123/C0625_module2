package ss3_oop.bai_tap.quadratic_equation;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Enter number b");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Enter number c");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        System.out.println(qe.getResult());
    }
}
