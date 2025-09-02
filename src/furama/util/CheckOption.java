package furama.util;

import java.util.Scanner;

public class CheckOption {
    public static int checkOption(int option, Scanner sc) {
        try {
            option = Integer.parseInt(sc.nextLine());
            return option;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
