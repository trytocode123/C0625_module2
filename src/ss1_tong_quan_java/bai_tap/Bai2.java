package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class Bai2 {

    public static int input() {
        System.out.print("Mời bạn nhập tiền tệ USD: ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

    public static int exchangeUnitMoney(int input) {
        return input * 26000;
    }

    public static void main(String[] args) {
        int input = input();
        System.out.println("Tiền sau khi chuyển đổi " + exchangeUnitMoney(input) + " VND");
    }
}
