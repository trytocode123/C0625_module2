package ss2_mang.bai_tap;

import java.util.Arrays;

public class Bai7 {

    public static int sumDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] input = InputMatrix.inputMatrix();
        System.out.println("Array has been created " + Arrays.toString(input));
        System.out.println("Sum of 2 diagonal: " + sumDiagonal(input));
    }
}
