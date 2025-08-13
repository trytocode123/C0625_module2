package ss8_mvc.bai_1.view;

import ss8_mvc.bai_1.controller.CarController;
import ss8_mvc.bai_1.controller.MotorbikeController;
import ss8_mvc.bai_1.controller.TruckController;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        Scanner sc = new Scanner(System.in);

        final int CAR = 1;
        final int TRUCK = 2;
        final int MOTORBIKE = 3;
        boolean flag = true;
        while (flag) {
            System.out.println("\n1. Manage car\n2. Manage truck\n3. Manage motorbike\n4. Exit");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case CAR:
                    CarController carController = new CarController();
                    carController.displayMenu();
                    break;
                case TRUCK:
                    TruckController truckController = new TruckController();
                    truckController.displayMenu();
                    break;
                case MOTORBIKE:
                    MotorbikeController motorbikeController = new MotorbikeController();
                    motorbikeController.displayMenu();
                    break;
                default:
                    flag = false;
            }
        }
    }
}
