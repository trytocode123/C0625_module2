package ss19_regex.bai_tap.bai_1;

import java.util.Scanner;

public class ValidateTelephone {
    public static void main(String[] args) {
        System.out.println("Enter telephone to check: ");
        Scanner sc = new Scanner(System.in);
        String telephone = sc.nextLine();
        if (checkTelephone(telephone)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }

    public static boolean checkTelephone(String telephone) {
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        return telephone.matches(regex);
    }
}
