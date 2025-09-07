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
            System.out.println("Enter id (NV-YYYY)");
            iD = sc.nextLine();
            try {
                RegexInputPeople.checkId(iD, "NV");
                break;
            } catch (UserException e) {
                System.err.println(e.getMessage());
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
                System.err.println("FormatFullName");
            }
        } while (true);


        LocalDate DOB = null;
        while (true) {
            try {
                int ageEnough = 0;
                do {
                    System.out.println("Enter date of birth (dd/MM/yyyy)");
                    DOB = LocalDate.parse(sc.nextLine(), formatter);
                    Period age = Period.between(DOB, LocalDate.now());
                    ageEnough = age.getYears();
                    if (ageEnough < 18) {
                        System.out.println("AgeNotEnough");
                    }
                } while (ageEnough < 18);
                break;
            } catch (DateTimeException e) {
                System.err.println(e.getMessage() + " dd/MM/yyyy");
            }
        }

        boolean gender = false;
        final int MALE = 1;
        final int FEMALE = 2;
        boolean flagOptionGender = true;
        while (flagOptionGender) {
            System.out.println("Enter gender\n1 Male\n2 Female");
            int optionGender = Integer.parseInt(sc.nextLine());
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
        String identify = null;
        do {
            System.out.println("Enter identify");
            identify = sc.nextLine();
            try {
                RegexInputPeople.checkIdentify(identify);
                break;
            } catch (UserException e) {
                System.err.println("FormatIdentify");
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
                System.err.println("FormatPhoneNumber");
            }
        } while (true);

        System.out.println("Enter email");
        String email = sc.nextLine();

        String level = null;
        final int TRUNG_CAP = 1;
        final int CAO_DANG = 2;
        final int DAI_HOC = 3;
        final int SAU_DAI_HOC = 4;
        boolean flagType = true;
        while (flagType) {
            System.out.println("Enter the level\n1 Trung cấp\n2 Cao đẳng\n3 Đại học\n4 Sau đại học");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case TRUNG_CAP:
                    level = "Trung cấp";
                    break;
                case CAO_DANG:
                    level = "Cao đẳng";
                    break;
                case DAI_HOC:
                    level = "Đại học";
                    break;
                case SAU_DAI_HOC:
                    level = "Sau đại học";
                    break;
                default:
                    System.err.println("Not valid, enter again");
                    continue;
            }
            flagType = false;
        }
        String position = null;
        boolean flagPos = true;

        final int LE_TAN = 1;
        final int PHUC_VU = 2;
        final int CHUYEN_VIEN = 3;
        final int GIAM_SAT = 4;
        final int QUAN_LY = 5;
        final int GIAM_DOC = 6;
        while (flagPos) {
            System.out.println("Enter the position\n1 Lễ tân\n2 Phục vụ\n3 Chuyên viên\n4 Giám sát\n5 Quản lý\n6 Giám đốc");
            int pos = Integer.parseInt(sc.nextLine());
            switch (pos) {
                case LE_TAN:
                    position = "Lễ tân";
                    break;
                case PHUC_VU:
                    position = "Phục vụ";
                    break;
                case CHUYEN_VIEN:
                    position = "Chuyên viên";
                    break;
                case GIAM_SAT:
                    position = "Giám sát";
                    break;
                case QUAN_LY:
                    position = "Quản lý";
                    break;
                case GIAM_DOC:
                    position = "Giám đốc";
                    break;
                default:
                    System.err.println("Select again");
                    continue;
            }
            flagPos = false;
        }

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
                System.err.println("FormatFullName");
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
                        System.err.println("AgeNotEnough");
                    }
                } while (ageEnough < 18);
                flagDOB = false;
            } catch (DateTimeException e) {
                System.err.println(e.getMessage() + " dd/MM/yyyy");
            }
        }

        boolean gender = false;
        final int MALE = 1;
        final int FEMALE = 2;
        boolean flagOptionGender = true;
        while (flagOptionGender) {
            System.out.println("Enter gender\n1 Male\n2 Female");
            int optionGender = Integer.parseInt(sc.nextLine());
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
        String level = null;
        final int TRUNG_CAP = 1;
        final int CAO_DANG = 2;
        final int DAI_HOC = 3;
        final int SAU_DAI_HOC = 4;
        boolean flagType = true;
        while (flagType) {
            System.out.println("Enter the level\n1 Trung cấp\n2 Cao đẳng\n3 Đại học\n4 Sau đại học");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case TRUNG_CAP:
                    level = "Trung cấp";
                    break;
                case CAO_DANG:
                    level = "Cao đẳng";
                    break;
                case DAI_HOC:
                    level = "Đại học";
                    break;
                case SAU_DAI_HOC:
                    level = "Sau đại học";
                    break;
                default:
                    System.err.println("Not valid, enter again");
                    continue;
            }
            flagType = false;
        }
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
        String iDEmp = null;
        while (true) {
            System.out.println("Enter id (NV-YYYY)");
            iDEmp = sc.nextLine();
            try {
                RegexInputPeople.checkId(iDEmp, "NV");
                break;
            } catch (UserException e) {
                System.err.println(e.getMessage());
            }
        }
        return iDEmp;
    }
}
