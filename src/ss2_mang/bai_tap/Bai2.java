package ss2_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static int[] add(int[] input) {
        System.out.println("Enter the number need to be add");
        Scanner sc = new Scanner(System.in);
        int numAdd = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the position need to be added");
        int positionAdd = Integer.parseInt(sc.nextLine());
        if (positionAdd > -1 || positionAdd < input.length - 1) {
            for (int i = input.length - 1; i >= positionAdd; i--) {
                input[i] = input[i - 1];
            }
            input[positionAdd] = numAdd;
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = Input.input();
        System.out.println("Array has been created " + Arrays.toString(input));
        System.out.println(Arrays.toString(add(input)));
    }
}
