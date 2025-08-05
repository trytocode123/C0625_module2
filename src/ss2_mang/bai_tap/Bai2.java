package ss2_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static int[] add(int[] array) {
        System.out.println("Enter the number need to be add");
        Scanner sc = new Scanner(System.in);
        int numAdd = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the position need to be added");
        int positionAdd = Integer.parseInt(sc.nextLine());
        if (positionAdd > -1 || positionAdd < array.length - 1) {
            for (int i = array.length - 1; i >= positionAdd; i--) {
                array[i] = array[i - 1];
            }
            array[positionAdd] = numAdd;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] input = Input.input();
        System.out.println("Array has been created " + Arrays.toString(input));
        System.out.println(Arrays.toString(add(input)));
    }
}
