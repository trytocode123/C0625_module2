package ss2_vong_lap.bai_tap;

import java.util.Scanner;

public class Bai1 {

    final static int RECTANGEL = 1;
    final static int TRIAGLE_BOTTOM_LEFT = 2;
    final static int TRIAGLE_TOP_LEFT = 3;
    final static int ISOSCELES_TRIANGEL = 4;

    public static void displayShape() {
        System.out.println("Enter option below\n 1. Rectangel\n 2. Triagle bottom left\n 3. Triangle bottom top\n 4. Isosceles triangle");
        Scanner sc = new Scanner(System.in);
        int option = Integer.parseInt(sc.nextLine());
        switch (option) {
            case RECTANGEL:
                rectangel();
                break;
            case TRIAGLE_BOTTOM_LEFT:
                triangelBottomLeft();
                break;

            case TRIAGLE_TOP_LEFT:
                triangelTopLeft();
                break;
            case ISOSCELES_TRIANGEL:
                isoscelesTriangle();
                break;
        }
    }

    public static void rectangel() {
        System.out.println("Enter the number of column: ");
        Scanner sc = new Scanner(System.in);
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the number of row: ");
        int column = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangelBottomLeft() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of column: ");
        int column = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < column; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangelTopLeft() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of column: ");
        int column = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < column; i++) {
            for (int j = column; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void isoscelesTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayShape();
    }
}
