package furama.controller;

import furama.entity.Employee;
import furama.service.EmployeeService;
import furama.service.IEmployeeService;
import furama.util.CheckOption;
import furama.util.RegexInputPeople;
import furama.util.UserException;
import furama.view.CustomerView;
import furama.view.EmployeeView;


import java.util.List;
import java.util.Scanner;

public class EmployeeManagementController {
    public void displayMenu() {
        IEmployeeService employeeService = new EmployeeService();
        final int DISPLAY = 1;
        final int ADD = 2;
        final int EDIT = 3;
        final int DELETE = 4;
        final int FIND = 5;
        final int RETURN = 6;
        boolean flag = true;
        int option = 0;
        while (flag) {
            System.out.println("1 Display list customers\n2 Add new customer\n3 Edit customer\n4 Delete customer\n5 Find customer\n6 Return main menu");
            Scanner sc = new Scanner(System.in);

            do {
                System.out.println("Enter option");
                option = CheckOption.checkOption(option, sc);
            } while (option == -1);
            switch (option) {
                case DISPLAY:
                    System.out.println("This is list employees");
                    List<Employee> employeeList = employeeService.findAll();
                    for (Employee employee : employeeList) {
                        System.out.println(employee);
                    }
                    break;

                case ADD:
                    if (employeeService.add(EmployeeView.inputForEmployee())) {
                        System.out.println("Added new customer");
                    } else {
                        System.err.println("Add fail");
                    }
                    break;

                case EDIT:
                    System.out.println("Enter id to edit");
                    String iDEdit = null;
                    while (true) {
                        try {
                            iDEdit = CustomerView.inputForID();
                            RegexInputPeople.checkId(iDEdit, "NV");
                            break;
                        } catch (UserException e) {
                            System.err.println(e.getMessage());
                        }
                    }

                    int index = employeeService.isValid(iDEdit);
                    if (index != -1) {
                        boolean flagUpdate = true;
                        while (flagUpdate) {

                            if (employeeService.update(index, EmployeeView.inputForCustomerEdit(iDEdit))) {
                                System.out.println("Update succeed");
                            }
                            flagUpdate = false;
                        }
                    } else {
                        System.err.println("Not found to update");
                    }
                    break;
                case DELETE:
                    System.out.println("Enter id employee to delete (NV-YYYY)");
                    if (employeeService.delete(EmployeeView.inputForID())) {
                        System.out.println("Delete succeed");
                    } else {
                        System.err.println("Not found to delete");
                    }
                    break;
                case FIND:
                    System.out.println("Enter id employee to find (NV-YYYY)");
                    int i = employeeService.isValid(EmployeeView.inputForID());
                    if (i != -1) {
                        System.out.println(employeeService.findAll().get(i));
                    } else {
                        System.err.println("Not found");
                    }
                    break;
                case RETURN:
                    flag = false;
                default:
            }
        }
    }
}
