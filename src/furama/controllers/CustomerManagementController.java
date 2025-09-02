package furama.controllers;

import furama.entity.Customer;
import furama.service.CustomerService;
import furama.service.ICustomerService;
import furama.util.CheckOption;
import furama.util.RegexInputPeople;
import furama.util.UserException;
import furama.view.CustomerView;

import java.util.List;
import java.util.Scanner;

public class CustomerManagementController {
    public void displayMenu() {
        ICustomerService customerService = new CustomerService();
        Scanner sc = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int EDIT = 3;
        final int RETURN = 4;
        boolean flag = true;
        int option = -1;
        while (flag) {
            System.out.println("1 Display list customers\n2 Add new customer\n3 Edit customer\n4 Return main menu");
            do {
                System.out.println("Enter option");
                option = CheckOption.checkOption(option, sc);
            } while (option == -1);
            switch (option) {
                case DISPLAY:
                    System.out.println("This is list customers");
                    List<Customer> customerList = customerService.findAll();
                    CustomerView.display(customerList);
                    break;
                case ADD:
                    if (customerService.add(CustomerView.inputForCustomer())) {
                        System.out.println("Added new customer");
                    } else {
                        System.out.println("Add fail");
                    }
                    break;
                case EDIT:
                    System.out.println("Enter id to edit");
                    String iDEdit = null;
                    while (true) {
                        try {
                            iDEdit = CustomerView.inputForID();
                            RegexInputPeople.checkId(iDEdit, "KH");
                            break;
                        } catch (UserException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    int index = customerService.isValid(iDEdit);
                    if (index != -1) {
                        boolean flagUpdate = true;
                        while (flagUpdate) {

                            if (customerService.update(index, CustomerView.inputForCustomerEdit(iDEdit))) {
                                System.out.println("Update succeed");
                            }
                            flagUpdate = false;
                        }
                    } else {
                        System.out.println("Not found to update");
                    }
                    break;
                case RETURN:
                    flag = false;
                default:
                    System.out.println("Enter option again");
                    break;
            }
        }
    }
}
