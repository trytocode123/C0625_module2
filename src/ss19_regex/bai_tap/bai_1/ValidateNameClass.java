package ss19_regex.bai_tap.bai_1;

import java.util.Scanner;

public class ValidateNameClass {
    public static void main(String[] args) {
        System.out.println("Enter class name to check: ");
        Scanner sc = new Scanner(System.in);
        String className = sc.nextLine();
        if (checkClassName(className)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }

    public static boolean checkClassName(String className) {
        String regex = "^[CAP]\\d{4}[GHIK]$";
        return className.matches(regex);
    }

}
