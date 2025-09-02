package furama.view;

import furama.entity.Room;
import furama.entity.Villa;
import furama.util.RegexInputFacility;
import furama.util.UserException;

import java.util.Scanner;

public class RoomView {
    static Scanner sc = new Scanner(System.in);

    public static Room inputForRoom() {
        String iD = null;
        do {
            System.out.println("Enter id");
            iD = sc.nextLine();
            try {
                RegexInputFacility.checkIdFacility(iD, "RO");
                break;
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String name = null;
        do {
            System.out.println("Enter name");
            name = sc.nextLine();
            try {
                RegexInputFacility.checkTextFormat(name);
                break;
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        double areaUse = 0.0;
        do {
            System.out.println("Enter area use");
            areaUse = Double.parseDouble(sc.nextLine());
            try {
                RegexInputFacility.checkAreaPoolAndUse(areaUse);
                break;
            } catch (UserException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        double feeRent = 0.0;
        do {
            System.out.println("Enter fee rent");
            feeRent = Double.parseDouble(sc.nextLine());
            try {
                RegexInputFacility.checkFeeRent(feeRent);
                break;
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        int maxPeople = 0;
        do {
            System.out.println("Enter max people");
            maxPeople = Integer.parseInt(sc.nextLine());
            try {
                RegexInputFacility.checkMaxPeople(maxPeople);
                break;
            } catch (UserException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String typeRent = null;
        do {
            System.out.println("Enter max people");
            typeRent = sc.nextLine();
            try {
                RegexInputFacility.checkTextFormat(typeRent);
                break;
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        System.out.println("Enter free service");
        String freeService = sc.next();

        return new Room(iD, name, areaUse, feeRent, maxPeople, typeRent, freeService);
    }
}

