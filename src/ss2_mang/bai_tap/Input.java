package ss2_mang.bai_tap;

import java.util.Scanner;

public class Input {
    public static int[] input() {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter length of array");
            size = Integer.parseInt(sc.nextLine());
        } while (size <= 0);

        arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number at " + (i + 1));
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        return arr;
    }
}
