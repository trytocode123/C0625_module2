package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class Bai1 {

    public static String input() {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }
    public static void main(String[] args) {
        System.out.println("Hello: " + input());
    }
}
