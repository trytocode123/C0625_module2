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
        final int RETURN = 4;
        boolean flag = true;

        while (flag) {
            System.out.println("1 Display list employees\n2 Add new employee\n3 Edit employee\n4 Return main menu");
            Scanner sc = new Scanner(System.in);
            int option = 0;
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
                        System.out.println("Add fail");
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
                            System.out.println(e.getMessage());
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
                        System.out.println("Not found to update");
                    }
                    break;

                case RETURN:
                    flag = false;
                default:
            }
        }
    }
}
