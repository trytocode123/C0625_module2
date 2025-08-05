package ss2_vong_lap.bai_tap;

public class IsPrime {
    public static boolean isPrime(int num) {
        if (num >= 2) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
