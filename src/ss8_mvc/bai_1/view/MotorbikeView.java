package ss8_mvc.bai_1.view;

import ss8_mvc.bai_1.entity.Motorbike;


import java.util.List;
import java.util.Scanner;

public class MotorbikeView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<Motorbike> motorbikes) {
        for (Motorbike motorbike : motorbikes) {
            System.out.println(motorbike);
        }
    }

    public static Motorbike inputForMotorBikeData() {
        System.out.println("Enter control number");
        String numberControl = sc.nextLine();
        System.out.println("Enter name of manufacturer");
        String nameManufacturer = sc.nextLine();
        System.out.println("Enter year of manufacture");
        int yearManufacture = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name of owner");
        String nameOwner = sc.nextLine();
        System.out.println("Enter power");
        double power = Double.parseDouble(sc.nextLine());

        return new Motorbike(numberControl, nameManufacturer, yearManufacture, nameOwner, power);
    }

    public static Motorbike inputForMotorBikeEditData(String numberControl) {
        System.out.println("Enter name of manufacturer");
        String nameManufacturer = sc.nextLine();
        System.out.println("Enter year of manufacture");
        int yearManufacture = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name of owner");
        String nameOwner = sc.nextLine();
        System.out.println("Enter power");
        double power = Double.parseDouble(sc.nextLine());

        return new Motorbike(numberControl, nameManufacturer, yearManufacture, nameOwner, power);
    }

    public static String inputNumberControlMotorBike() {
        System.out.println("Enter number control");
        return sc.nextLine();
    }
}
