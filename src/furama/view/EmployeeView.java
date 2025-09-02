package furama.view;

import furama.entity.Employee;
import furama.util.RegexInputPeople;
import furama.util.UserException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    static Scanner sc = new Scanner(System.in);
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void display(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static Employee inputForEmployee() {
        String iD = null;
        do {
            System.out.println("Enter id");
            iD = sc.nextLine();
            try {
                RegexInputPeople.checkId(iD, "NV");
                break;
            } catch (UserException e) {
                System.out.println("FormatId");
            }
        } while (true);
        String fullName = null;
        do {
            System.out.println("Enter full name");
            fullName = sc.nextLine();
            try {
                RegexInputPeople.checkFullName(fullName);
                break;
            } catch (UserException e) {
                System.out.println("FormatFullName");
            }
        } while (true);

        boolean flagDOB = true;
        LocalDate DOB = null;
        while (flagDOB) {
            try {
                int ageEnough = 0;
                do {
                    System.out.println("Enter date of birth");
                    DOB = LocalDate.parse(sc.nextLine(), formatter);
                    Period age = Period.between(DOB, LocalDate.now());
                    ageEnough = age.getYears();
                    if (ageEnough < 18) {
                        System.out.println("AgeNotEnough");
                    }
                } while (ageEnough < 18);
                flagDOB = false;
            } catch (DateTimeException e) {
                System.out.println(e.getMessage() + " dd/MM/yyyy");
            }
        }
        System.out.println("Enter gender");
        boolean gender = Boolean.parseBoolean(sc.nextLine());
        String identify = null;
        do {
            System.out.println("Enter identify");
            identify = sc.nextLine();
            try {
                RegexInputPeople.checkIdentify(identify);
                break;
            } catch (UserException e) {
                System.out.println("FormatIdentify");
            }
        } while (true);
        String phoneNumber = null;
        do {
            System.out.println("Enter phone number");
            phoneNumber = sc.nextLine();
            try {
                RegexInputPeople.checkPhoneNumber(phoneNumber);
                break;
            } catch (UserException e) {
                System.out.println("FormatPhoneNumber");
            }
        } while (true);

        System.out.println("Enter email");
        String email = sc.nextLine();
        //String level, String position, float salary
        System.out.println("Enter level");
        String level = sc.nextLine();
        System.out.println("Enter position");
        String position = sc.nextLine();
        System.out.println("Enter salary");
        int salary = Integer.parseInt(sc.nextLine());
        return new Employee(iD, fullName, DOB, gender, identify, phoneNumber, email, level, position, salary);
    }

    public static Employee inputForCustomerEdit(String iD) {

        String fullName = null;
        do {
            System.out.println("Enter full name");
            fullName = sc.nextLine();
            try {
                RegexInputPeople.checkFullName(fullName);
                break;
            } catch (UserException e) {
                System.out.println("FormatFullName");
            }
        } while (true);

        boolean flagDOB = true;
        LocalDate DOB = null;
        while (flagDOB) {
            try {
                int ageEnough = 0;
                do {
                    System.out.println("Enter date of birth");
                    DOB = LocalDate.parse(sc.nextLine(), formatter);
                    Period age = Period.between(DOB, LocalDate.now());
                    ageEnough = age.getYears();
                    if (ageEnough < 18) {
                        System.out.println("AgeNotEnough");
                    }
                } while (ageEnough < 18);
                flagDOB = false;
            } catch (DateTimeException e) {
                System.out.println(e.getMessage() + " dd/MM/yyyy");
            }
        }
        System.out.println("Enter gender");
        boolean gender;
        while (true) {
            try {
                gender = Boolean.parseBoolean(sc.nextLine());
                break;
            } catch (InputMismatchException e) {
                System.out.println("GenderNotValid");
            }
        }

        String identify = null;
        do {
            System.out.println("Enter identify");
            identify = sc.nextLine();
            try {
                RegexInputPeople.checkIdentify(identify);
                break;
            } catch (UserException e) {
                System.out.println("FormatIdentify");
            }
        } while (true);
        String phoneNumber = null;
        do {
            System.out.println("Enter phone number");
            phoneNumber = sc.nextLine();
            try {
                RegexInputPeople.checkPhoneNumber(phoneNumber);
                break;
            } catch (UserException e) {
                System.out.println("FormatPhoneNumber");
            }
        } while (true);

        System.out.println("Enter email");
        String email = sc.nextLine();
        System.out.println("Enter level");
        String level = sc.nextLine();
        System.out.println("Enter position");
        String position = sc.nextLine();
        System.out.println("Enter salary");
        int salary = 0;
        while (true) {
            try {
                salary = Integer.parseInt(sc.nextLine());
                RegexInputPeople.checkSalary(salary);
                break;
            } catch (UserException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        return new Employee(iD, fullName, DOB, gender, identify, phoneNumber, email, level, position, salary);
    }

    public static String inputForID() {
        return sc.nextLine();
    }
}
