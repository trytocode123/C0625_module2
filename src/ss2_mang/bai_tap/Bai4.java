package ss2_mang.bai_tap;

import java.util.Arrays;

public class Bai4 {

    public static int findMaxMatrix(int[][] array) {
        int max = array[0][0];
        for (int[] item : array) {
            for (int element : item) {
                if (element >= max) {
                    max = element;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] input = InputMatrix.inputMatrix();
        System.out.println("Array has been created" + Arrays.deepToString(input));
        System.out.println("Max is " + findMaxMatrix(input));
    }
}
