package furama.controllers;

import furama.entity.Booking;
import furama.entity.Contract;
import furama.entity.Customer;
import furama.entity.Facility;
import furama.service.*;
import furama.util.CheckOption;
import furama.view.BookingView;
import furama.view.ContractView;

import java.util.*;

public class BookingManagementController {
    public void displayMenu() {
        final int ADD = 1;
        final int DISPLAY_BOOKING = 2;
        final int CREATE = 3;
        final int DISPLAY_CONTRACTS = 4;
        final int EDIT_CONTRACTS = 5;
        final int EXIT = 6;
        boolean flag = true;
        IBookingService bookingService = new BookingService();
        ContractService contractService = new ContractService();
        Queue<Booking> bookingQueue = new ArrayDeque<>(bookingService.findAll());
        List<Contract> contractList = null;
        while (flag) {
            System.out.println("1. Add new booking\n2. Display list bookings\n3. Create new contracts\n4. Display list contracts\n5. Edit contracts\n6. Return main menu");
            Scanner sc = new Scanner(System.in);
            int option = 0;
            do {
                System.out.println("Enter option");
                option = CheckOption.checkOption(option, sc);
            } while (option == -1);

            switch (option) {
                case ADD:
                    System.out.println("Add new booking");
                    System.out.println("List of services");
                    FacilityService facilityService = new FacilityService();
                    LinkedHashMap<Facility, Integer> linkedHashMap = facilityService.findAll();
                    for (Map.Entry<Facility, Integer> entry : linkedHashMap.entrySet()) {
                        System.out.println(entry.getKey() + "Time: " + entry.getValue());
                    }

                    System.out.println("\nList of customers");
                    CustomerService customerService = new CustomerService();
                    List<Customer> customerList = customerService.findAll();
                    for (Customer customer : customerList) {
                        System.out.println(customer);
                    }

                    boolean result = bookingService.add(BookingView.inputForBooking());
                    if (result) {
                        bookingService.timeRent(facilityService.findAll());
                    }
                    System.out.println("Booking succeed");
                    break;
                case DISPLAY_BOOKING:
                    System.out.println("List booking");System.out.println("+-------+--------------+--------------+--------------+------------+------------+");
                    System.out.println("| Id    | Date booking | Start date   | End date     | CustomerId | ServiceID  |");
                    System.out.println("+-------+--------------+--------------+--------------+------------+------------+");
                    TreeSet<Booking> bookingTreeSet = bookingService.findAll();
                    for (Booking booking : bookingTreeSet) {
                        System.out.println(booking);
                    }
                    System.out.println("+-------+--------------+--------------+--------------+------------+------------+");
                    break;
                case CREATE:
                    System.out.println("Enter information to create new contracts");
                    contractList = contractService.findAll();
                    if (!bookingQueue.isEmpty()) {
                        contractList.add(ContractView.inputForContract(bookingQueue.remove().getId()));
                        System.out.println("Add succeed");
                    } else {
                        System.out.println("Not exist any booking to create new contract");
                    }
                    break;
                case DISPLAY_CONTRACTS:
                    System.out.println("This is list contracts");
                    contractList = contractService.findAll();
                    if (contractList.isEmpty()) {
                        System.out.println("Please add new contract to display");
                    }
                    ContractView.display(contractService.findAll());
                    break;
                case EDIT_CONTRACTS:
                    System.out.println("Enter information to edit new contracts");
                    String iD = sc.nextLine();
                    int i = contractService.isValid(iD);
                    contractList = contractService.findAll();
                    if (i == -1) {
                        System.out.println("Not found to edit");
                    } else {
                        contractService.update(i, ContractView.inputForEditContract(contractList.get(i).getID()));
                        System.out.println("Update succeed");
                    }
                    break;
                case EXIT:
                    flag = false;
                default:
            }
        }
    }
}
