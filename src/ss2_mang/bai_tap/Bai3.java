package ss2_mang.bai_tap;

import java.util.Arrays;

public class Bai3 {
    public static int[] concatArray(int[] input1, int[] input2) {
        int[] output = new int[input1.length + input2.length];
        for (int i = 0; i < input1.length; i++) {
            output[i] = input1[i];
        }
        for (int i = 0; i < input2.length; i++) {
            output[i + output.length - input2.length] = input2[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input1 = Input.input();
        int[] input2 = Input.input();
        System.out.println("Array has been created " + Arrays.toString(concatArray(input1, input2)));
    }
}
