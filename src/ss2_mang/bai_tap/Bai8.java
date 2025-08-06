package ss2_mang.bai_tap;

import java.util.Scanner;

public class Bai8 {

    public static int countAppearanceChar(String str, String chr) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(chr.charAt(0) == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println("Enter char to count appearance");
        String ch = sc.nextLine();
        System.out.println("Time of appearances" + ch + " " +  countAppearanceChar(str, ch));
    }
}
