package furama.view;

import furama.entity.Contract;

import java.util.List;
import java.util.Scanner;

public class ContractView {
    static Scanner sc = new Scanner(System.in);

    public static void display(List<Contract> contracts) {
        for (Contract contract : contracts) {
            System.out.println(contract);
        }
    }

    public static Contract inputForContract(int iDBooking) {
        System.out.println("Enter deposit");
        int deposit = Integer.parseInt(sc.nextLine());
        System.out.println("Enter total payment");
        int totalPayment = Integer.parseInt(sc.nextLine());
        return new Contract(iDBooking, deposit, totalPayment);
    }

    public static Contract inputForEditContract(int iDBooking) {
        System.out.println("Enter deposit");
        int deposit = Integer.parseInt(sc.nextLine());
        System.out.println("Enter total payment");
        int totalPayment = Integer.parseInt(sc.nextLine());
        return new Contract(iDBooking, deposit, totalPayment);
    }
}
