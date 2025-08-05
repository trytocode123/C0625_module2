package ss2_mang.bai_tap;

import java.util.Scanner;

public class InputMatrix {
    public static int[][] inputMatrix() {
        int[][] arrMatrix;
        System.out.println("Enter length of array");
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            size = Integer.parseInt(sc.nextLine());
        } while (size <= 0);

        arrMatrix = new int[size][];

        for (int i = 0; i < arrMatrix.length; i++) {
            System.out.println("Enter length of array " + (i + 1));
            int n = Integer.parseInt(sc.nextLine());
            arrMatrix[i] = new int[n];
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the number at " + (j + 1));
                arrMatrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        return arrMatrix;
    }
}
