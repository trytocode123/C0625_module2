package furama.controllers;

import java.util.Scanner;

public class BookingManagermentController {
    public void displayMenu() {
        final int DISPLAY = 1;
        final int ADD = 2;
        final int EDIT = 3;
        final int RETURN = 4;
        boolean flag = true;
        while (flag) {
            System.out.println("1 Display list employees\n2 Add new employee\n3 Edit employee\n4 Return main menu");
            Scanner sc = new Scanner(System.in);
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case DISPLAY:
                    System.out.println("This is list employees");
                    //service
                    break;
                case ADD:
                    System.out.println("Add new employee");
                    //service
                    break;
                case EDIT:
                    System.out.println("Enter information to edit");
                    //service
                    break;
                case RETURN:
                    flag = false;
            }
        }
    }
}
