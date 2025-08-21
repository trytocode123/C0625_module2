package ss8_mvc.bai_1.view;

import ss8_mvc.bai_1.entity.Truck;


import java.util.List;
import java.util.Scanner;

public class TruckView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<Truck> trucks) {
        for (Truck truck : trucks) {
            System.out.println(truck);
        }
    }

    public static Truck inputForTruckData() {
        System.out.println("Enter control number");
        String numberControl = sc.nextLine();
        System.out.println("Enter name of manufacturer");
        String nameManufacturer = sc.nextLine();
        System.out.println("Enter year of manufacture");
        int yearManufacture = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name of owner");
        String nameOwner = sc.nextLine();
        System.out.println("Enter payload");
        double payload = Double.parseDouble(sc.nextLine());

        return new Truck(numberControl, nameManufacturer, yearManufacture, nameOwner, payload);
    }

    public static Truck inputForTruckEditData(String numberControl) {
        System.out.println("Enter name of manufacturer");
        String nameManufacturer = sc.nextLine();
        System.out.println("Enter year of manufacture");
        int yearManufacture = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name of owner");
        String nameOwner = sc.nextLine();
        System.out.println("Enter payload");
        double payload = Double.parseDouble(sc.nextLine());

        return new Truck(numberControl, nameManufacturer, yearManufacture, nameOwner, payload);
    }

    public static String inputNumberControlTruck() {
        System.out.println("Enter number control");
        return sc.nextLine();
    }
}
