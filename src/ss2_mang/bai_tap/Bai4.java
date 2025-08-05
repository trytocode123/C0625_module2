package ss2_mang.bai_tap;

import java.util.Arrays;

public class Bai4 {
    public static void main(String[] args) {
        String result = "";
        int[][] input = InputMatrix.inputMatrix();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                result = Arrays.toString(input[i]);
            }
        }
        System.out.println(result);
    }
}
