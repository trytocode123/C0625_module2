package ss2_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {

    public static int sumColumn(int[][] array, int col) {
        int sum = 0;

        for (int[] item : array) {
            sum += item[col - 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] input = InputMatrix.inputMatrix();
        Scanner sc = new Scanner(System.in);
        int column;
        do {
            System.out.println("Enter the column to summarize");
            column = Integer.parseInt(sc.nextLine());
        } while (column < 1 || column > input.length);
        System.out.println("Array has been created " + Arrays.toString(input));
        System.out.println("Sum of column " + column + ": " + sumColumn(input, column));
    }
}
