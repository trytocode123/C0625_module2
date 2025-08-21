package ss8_mvc.bai_1.controller;


import ss8_mvc.bai_1.entity.Truck;
import ss8_mvc.bai_1.service.ITruckService;
import ss8_mvc.bai_1.service.TruckService;
import ss8_mvc.bai_1.view.TruckView;

import java.util.ArrayList;
import java.util.List;
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
            System.out.println("----Manage truck----\n1. Display list of truck\n2. Add truck\n3. Update truck\n4. Delete truck\n5. Find truck\n6. Back to main menu");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case DISPLAY:
                    List<Truck> trucks = this.truckService.findAll();
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
                    String controlNumberToUpdate = TruckView.inputNumberControlTruck();
                    int i = truckService.findTruckByNumberControl(controlNumberToUpdate);

                    if (i != -1) {
                        this.truckService.update(i, TruckView.inputForTruckEditData(controlNumberToUpdate));
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
                    List<Truck> truckFindList = truckService.find(TruckView.inputNumberControlTruck());
                    if (truckFindList != null) {
                        System.out.println(truckFindList.size() == 1 ? "There is " + truckFindList.size() + " result:" : "There are " + truckFindList.size() + " results:");
                        for (Truck truckFind : truckFindList) {
                            System.out.println(truckFind);
                        }
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
