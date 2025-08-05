package ss2_mang.bai_tap;

import java.util.Arrays;

public class Bai3 {
    public static int[] concatArray(int[] array1, int[] array2) {
        int[] output = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            output[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            output[i + output.length - array2.length] = array2[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input1 = Input.input();
        int[] input2 = Input.input();
        System.out.println("Array 1 has been created " + Arrays.toString(input1));
        System.out.println("Array 2 has been created " + Arrays.toString(input2));
        System.out.println("Array after concat " + Arrays.toString(concatArray(input1, input2)));
    }
}
