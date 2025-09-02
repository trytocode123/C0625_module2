package furama.view;

import furama.entity.Customer;

import java.util.Scanner;

public class EmployeeView {
    public static Customer inputForCustomer(){
        //String iD, String fullName, String date, boolean gender, String identify, String phoneNumber, String email, String level, String position, float salary
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        String id = sc.nextLine();
        System.out.println("Enter full name");
        String fullName = sc.nextLine();
        System.out.println("Enter date of birth");
    }
}
