package furama.view;

import furama.entity.Villa;
import furama.util.RegexInputFacility;
import furama.util.UserException;

import java.util.Scanner;

public class VillaView {
    static Scanner sc = new Scanner(System.in);

    public static Villa inputForVilla() {
        String iD = null;
        do {
            System.out.println("Enter id");
            iD = sc.nextLine();
            try {
                RegexInputFacility.checkIdFacility(iD, "VL");
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

        System.out.println("Enter type rent");
        String typeRent = null;
        do {
            typeRent = sc.nextLine();
            try {
                RegexInputFacility.checkTextFormat(typeRent);
                break;
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        System.out.println("Enter area pool");
        float areaPool = 0.0f;
        do {
            areaPool = Integer.parseInt(sc.nextLine());
            try {
                RegexInputFacility.checkAreaPoolAndUse(areaPool);
                break;
            } catch (UserException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        System.out.println("Enter standard villa");
        String standardVilla = null;

        do {
            standardVilla = sc.nextLine();
            try {
                RegexInputFacility.checkTextFormat(standardVilla);
                break;
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        int numberFloor = 0;

        do {
            System.out.println("Enter number floor");
            try {
                numberFloor = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return new Villa(iD, name, areaUse, feeRent, maxPeople, typeRent, areaPool, standardVilla, numberFloor);
    }
}
