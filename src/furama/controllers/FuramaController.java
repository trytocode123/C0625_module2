package furama.controllers;

import furama.util.CheckOption;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        final int EMPLOYEE_MANAGEMENT = 1;
        final int CUSTOMER_MANAGEMENT = 2;
        final int FACILITY_MANAGEMENT = 3;
        final int BOOKING_MANAGEMENT = 4;
        final int PROMOTION_MANAGEMENT = 5;
        final int EXIT = 6;

        boolean flag = true;
        while (flag) {
            System.out.println("1. Employee Management\n2. Customer Management\n3. Facility Management\n4. Booking Management\n5. Promotion Management\n6. Exit");

            int option = 0;
            do {
                System.out.println("Enter option");
                option = CheckOption.checkOption(option, sc);
            } while (option == -1);
            switch (option) {
                case EMPLOYEE_MANAGEMENT:
                    EmployeeManagementController managementController = new EmployeeManagementController();
                    managementController.displayMenu();
                    break;
                case CUSTOMER_MANAGEMENT:
                    CustomerManagementController customerManagementController = new CustomerManagementController();
                    customerManagementController.displayMenu();
                    break;
                case FACILITY_MANAGEMENT:
                    FacilityManagementController facilityManagementController = new FacilityManagementController();
                    facilityManagementController.displayMenu();
                    break;
                case BOOKING_MANAGEMENT:
                    BookingManagementController bookingManagementController = new BookingManagementController();
                    bookingManagementController.displayMenu();
                    break;
                case PROMOTION_MANAGEMENT:
                    PromotionManagementController promotionManagementController = new PromotionManagementController();
                    promotionManagementController.displayMenu();
                    break;
                case EXIT:
                    flag = false;
                    break;
                default:
            }
        }
    }
}
