package ss2_vong_lap.bai_tap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng số nguyên tố cần in ra");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(n + " số nguyên tố");
        int count = 0;
        int num = 2;
        do {
            if (IsPrime.isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;

        } while (count < n);

    }
}
