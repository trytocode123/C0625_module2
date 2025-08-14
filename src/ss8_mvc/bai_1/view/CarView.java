package ss8_mvc.bai_1.view;

import ss8_mvc.bai_1.entity.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static Car inputForCarData() {
        System.out.println("Enter control number");
        String numberControl = sc.nextLine();
        System.out.println("Enter name of manufacturer");
        String nameManufacturer = sc.nextLine();
        System.out.println("Enter year of manufacture");
        int yearManufacture = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name of owner");
        String nameOwner = sc.nextLine();
        System.out.println("Enter number of seat");
        int numbSeat = Integer.parseInt(sc.nextLine());
        System.out.println("Enter type of car");
        String typeCar = sc.nextLine();
        return new Car(numberControl, nameManufacturer, yearManufacture, nameOwner, numbSeat, typeCar);
    }

    public static String inputNumberControlCar() {
        System.out.println("Enter number control");
        return sc.nextLine();
    }
}
