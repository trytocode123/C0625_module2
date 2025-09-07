package furama.view;

import furama.entity.Customer;
import furama.util.RegexInputPeople;
import furama.util.UserException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class CustomerView {

    public static void display(List<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    static Scanner sc = new Scanner(System.in);
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String iD() {
        String iD = null;
        boolean flag = true;
        while (flag) {
            System.out.println("Enter id (KH-YYYY)");
            iD = sc.nextLine();
            try {
                RegexInputPeople.checkId(iD, "KH");
                flag = false;
            } catch (UserException e) {
                System.err.println(e.getMessage());
            }
        }
        return iD;
    }

    public static String fullName() {
        boolean flag = true;
        String fullName = null;
        while (flag) {
            System.out.println("Enter full name");
            fullName = sc.nextLine();
            try {
                RegexInputPeople.checkFullName(fullName);
                flag = false;
            } catch (UserException e) {
                System.err.println(e.getMessage());
            }
        }
        return fullName;
    }

    public static String phoneNumber() {
        boolean flag = true;
        String phoneNumber = null;
        while (flag) {
            System.out.println("Enter phone number");
            phoneNumber = sc.nextLine();
            try {
                RegexInputPeople.checkPhoneNumber(phoneNumber);
                flag = false;
            } catch (UserException e) {
                System.err.println(e.getMessage());
            }
        }
        return phoneNumber;
    }

    public static String identify() {
        boolean flag = true;
        String identify = null;
        while (flag) {
            System.out.println("Enter identify");
            identify = sc.nextLine();
            try {
                RegexInputPeople.checkIdentify(identify);
                flag = false;
            } catch (UserException e) {
                System.err.println(e.getMessage());
            }
        }
        return identify;
    }

    public static Customer inputForCustomer() {
        String iD = iD();
        String fullName = fullName();

        boolean flagDOB = true;
        LocalDate DOB = null;
        while (flagDOB) {
            try {
                int ageEnough = 0;
                do {
                    System.out.println("Enter date of birth (dd/MM/yyyy)");
                    DOB = LocalDate.parse(sc.nextLine(), formatter);
                    Period age = Period.between(DOB, LocalDate.now());
                    ageEnough = age.getYears();
                    if (ageEnough < 18) {
                        System.err.println("AgeNotEnough");
                    }
                } while (ageEnough < 18);
                flagDOB = false;
            } catch (DateTimeException e) {
                System.err.println(e.getMessage() + " dd/MM/yyyy");
            }
        }
        System.out.println("Enter gender\n1 Male\n2 Female");
        int optionGender = Integer.parseInt(sc.nextLine());
        boolean gender = false;
        final int MALE = 1;
        final int FEMALE = 2;
        boolean flagOptionGender = true;
        while (flagOptionGender) {
            switch (optionGender) {
                case MALE:
                    gender = true;
                    flagOptionGender = false;
                    break;
                case FEMALE:
                    flagOptionGender = false;
                    break;
                default:
                    System.err.println("Select gender again");
            }
        }


        String identify = identify();
        String phoneNumber = phoneNumber();
        System.out.println("Enter email");
        String email = sc.nextLine();
        System.out.println("Enter type customer\n1 Diamond\n2 Platinum\n3 Gold\n4 Silver\n5 Member");
        String type = null;
        int option = Integer.parseInt(sc.nextLine());
        final int DIAMOND = 1;
        final int PLATINUM = 2;
        final int GOLD = 3;
        final int SILVER = 4;
        final int MEMBER = 5;
        boolean flagType = true;
        while (flagType) {
            switch (option) {
                case DIAMOND:
                    type = "Diamond";
                    flagType = false;
                    break;
                case PLATINUM:
                    type = "Platinum";
                    flagType = false;
                    break;
                case GOLD:
                    type = "Gold";
                    flagType = false;
                    break;
                case SILVER:
                    type = "Silver";
                    flagType = false;
                    break;
                case MEMBER:
                    type = "Member";
                    flagType = false;
                    break;
                default:
                    System.err.println("Not valid, enter again");
            }
        }

        System.out.println("Enter address");
        String address = sc.nextLine();
        return new Customer(iD, fullName, DOB, gender, identify, phoneNumber, email, type, address);
    }

    public static Customer inputForCustomerEdit(String iD) {
        iD = iD();
        String fullName = fullName();
        System.out.println("Enter date of birth");
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
                        System.err.println("AgeNotEnough");
                    }
                } while (ageEnough < 18);
                flagDOB = false;
            } catch (DateTimeException e) {
                System.out.println("Enter date of birth");
                System.out.println(e.getMessage() + " dd/MM/yyyy");
            }
        }
        System.out.println("Enter gender");
        boolean gender = Boolean.parseBoolean(sc.nextLine());
        String identify = identify();
        String phoneNumber = phoneNumber();
        System.out.println("Enter email");
        String email = sc.nextLine();
        System.out.println("Enter type customer");
        String type = sc.nextLine();
        System.out.println("Enter address");
        String address = sc.nextLine();
        return new Customer(iD, fullName, DOB, gender, identify, phoneNumber, email, type, address);
    }

    public static String inputForID() {
        String iD = null;
        while (true) {
            iD = sc.nextLine();
            try {
                RegexInputPeople.checkId(iD, "KH");
                break;
            } catch (UserException e) {
                System.err.println("Format Id");
            }
        }
        return iD;
    }
}
