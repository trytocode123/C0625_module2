package ss2_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {


    public static int[] deleteElement(int[] input) {
        System.out.println("Enter number need to be deleted");
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < input.length; i++) {
            if (input[i] == num) {
                for (int j = i; j < input.length - 1; j++) {
                    input[j] = input[j + 1];
                }
            }
        }
        input[input.length - 1] = 0;
        return input;
    }

    public static void main(String[] args) {
        int[] input = Input.input();
        System.out.println("Array has been created " + Arrays.toString(input));
        System.out.println(Arrays.toString(deleteElement(input)));
    }
}
