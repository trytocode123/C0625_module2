package ss2_mang.bai_tap;

import java.util.Scanner;

public class InputMatrix {
    public static int[][] inputMatrix() {
        int[][] arr;
        System.out.println("Enter length of array");
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            size = Integer.parseInt(sc.nextLine());
        } while (size <= 0);

        arr = new int [size][];

        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(sc.nextLine());

            arr[i] = new int [n];
            System.out.println("Enter the array at " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }

        }
        return arr;
    }
}
