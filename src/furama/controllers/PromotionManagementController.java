package furama.controllers;

import furama.entity.Booking;
import furama.repository.IFacilityRepository;
import furama.service.PromotionService;
import furama.util.CheckOption;

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class PromotionManagementController {
    public void displayMenu() {
        final int DISPLAY_CUSTOMERS_USE_SERVICE = 1;
        final int DISPLAY_LIST_CUSTOMERS_GET_VOUCHER = 2;
        final int RETURN = 3;
        boolean flag = true;
        PromotionService promotionService = new PromotionService();
        while (flag) {
            System.out.println("1. Display list customers use service\n2. Display list customers get voucher\n3. Return main menu");
            Scanner sc = new Scanner(System.in);
            int option = 0;
            do {
                System.out.println("Enter option");
                option = CheckOption.checkOption(option, sc);
            } while (option == -1);
            switch (option) {
                case DISPLAY_CUSTOMERS_USE_SERVICE:
                    System.out.println("This is list customers use service");
                    System.out.println("Enter the year");
                    int year = Integer.parseInt(sc.nextLine());

                    TreeSet<Booking> bookings = promotionService.findAllByYear(year);
                    if (bookings.isEmpty()) {
                        System.out.println("Not found");
                    } else {
                        bookings.forEach(System.out::println);
                    }

                    break;
                case DISPLAY_LIST_CUSTOMERS_GET_VOUCHER:
                    int stackSize = promotionService.findAllVoucher().size();
                    System.out.println("Please enter the quantity of voucher equal: " + stackSize);
                    int voucher10 = 0;
                    int voucher20 = 0;
                    int voucher50 = 0;
                    boolean result = false;

                    do {
                        System.out.println("Enter quantity of voucher 10%");
                        voucher10 = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter quantity of voucher 20%");
                        voucher20 = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter quantity of voucher 50%");
                        voucher50 = Integer.parseInt(sc.nextLine());
                        if ((voucher10 + voucher20 + voucher50) == stackSize) {
                            System.out.println("List customers get voucher");
                            promotionService.addVoucher(voucher10, voucher20, voucher50);
                            break;
                        } else {
                            System.out.println("Please enter the quantity of voucher equal: " + stackSize);
                        }
                    } while (true);
                    break;

                case RETURN:
                    flag = false;
            }
        }
    }
}

