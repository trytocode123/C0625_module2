package ss2_mang.bai_tap;

import java.util.Scanner;

public class InputMatrix {
    public static int[][] inputMatrix() {
        int[][] arrMatrix;
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter length of array");
            size = Integer.parseInt(sc.nextLine());
        } while (size <= 0);

        arrMatrix = new int[size][];

        for (int i = 0; i < arrMatrix.length; i++) {
            int size2;
            do {
                System.out.println("Enter length of array " + (i + 1));
                size2 = Integer.parseInt(sc.nextLine());
            } while (size2 < 1);
            arrMatrix[i] = new int[size2];
            for (int j = 0; j < arrMatrix[i].length; j++) {
                System.out.println("Enter the number at " + (j + 1));
                arrMatrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        return arrMatrix;
    }


}
