package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int vnd = 26000;
        System.out.print("Mời bạn nhập tiền tệ USD: ");
        Scanner sc = new Scanner(System.in);
        int usd = Integer.parseInt(sc.nextLine());
        int quyDoi = usd * vnd;
        System.out.print("Tiền sau khi quy đổi: " + quyDoi + " VND");
    }
}
