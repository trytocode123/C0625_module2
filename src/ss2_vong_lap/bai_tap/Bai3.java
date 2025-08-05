package ss2_vong_lap.bai_tap;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Số lượng số nguyên tố cần in ra < 100");
        for (int i = 2; i < 100; i++) {
            if (IsPrime.isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

