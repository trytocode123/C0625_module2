package ss3_oop.bai_tap;

import java.util.Scanner;

public class RunQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number b");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number c");
        int c = Integer.parseInt(sc.nextLine());
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        System.out.println(qe.getResult());
    }
}
