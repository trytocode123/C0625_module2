package ss8_mvc.bai_1.controller;


import ss8_mvc.bai_1.entity.Truck;
import ss8_mvc.bai_1.service.ITruckService;
import ss8_mvc.bai_1.service.TruckService;
import ss8_mvc.bai_1.view.TruckView;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckController {
    ITruckService truckService = new TruckService();

    public void displayMenu() {
        final int DISPLAY = 1;
        final int ADD = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int FIND = 5;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("----Manage motorbike----\n1. Display list of motorbike\n2. Add motorbike\n3. Update motorbike\n4. Delete motorbike\n5. Find motorbike\n6. Back to main menu");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case DISPLAY:
                    ArrayList<Truck> trucks = this.truckService.findAll();
                    TruckView.display(trucks);
                    break;
                case ADD:
                    System.out.println("This is add function");
                    Truck truck = TruckView.inputForTruckData();
                    boolean resultAdd = this.truckService.add(truck);
                    if (resultAdd) {
                        System.out.println("Add truck succeed");
                    }
                    break;
                case UPDATE:
                    System.out.println("This is update function");
                    int i = truckService.findTruckByNumberControl(TruckView.inputNumberControlTruck());

                    if (i != -1) {
                        this.truckService.update(i, TruckView.inputForTruckData());
                        System.out.println("Update truck succeed");
                    } else {
                        System.out.println("Update truck fail");
                    }
                    break;
                case DELETE:
                    System.out.println("This is delete function");
                    boolean resultDelete = this.truckService.delete(TruckView.inputNumberControlTruck());
                    if (resultDelete) {
                        System.out.println("Delete truck succeed");
                    } else {
                        System.out.println("Delete fail");
                    }
                    break;
                case FIND:
                    System.out.println("This is find function");
                    Truck truckFind = truckService.find(TruckView.inputNumberControlTruck());
                    if (truckFind != null) {
                        System.out.println(truckFind);
                    } else {
                        System.out.println("Can not find this truck");
                    }
                    break;
                default:
                    flag = false;
            }
        }
    }
}
