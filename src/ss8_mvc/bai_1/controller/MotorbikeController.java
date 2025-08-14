package ss8_mvc.bai_1.controller;

import ss8_mvc.bai_1.entity.Motorbike;
import ss8_mvc.bai_1.service.IMotorbikeService;
import ss8_mvc.bai_1.service.MotorbikeService;
import ss8_mvc.bai_1.view.CarView;
import ss8_mvc.bai_1.view.MotorbikeView;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeController {
    IMotorbikeService motorbikeService = new MotorbikeService();

    public void displayMenu() {
        final int DISPLAY = 1;
        final int ADD = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int FIND = 5;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        MotorbikeService motorbikeServiceService = new MotorbikeService();
        while (flag) {
            System.out.println("----Manage motorbike----\n1. Display list of motorbike\n2. Add motorbike\n3. Update motorbike\n4. Delete motorbike\n5. Find motorbike\n6. Back to main menu");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case DISPLAY:
                    ArrayList<Motorbike> motorbikes = this.motorbikeService.findAll();
                    MotorbikeView.display(motorbikes);
                    break;
                case ADD:
                    System.out.println("This is add function");
                    Motorbike motorbike = MotorbikeView.inputForMotorBikeData();
                    boolean resultAdd = this.motorbikeService.add(motorbike);
                    if (resultAdd) {
                        System.out.println("Add motorbike succeed");
                    }
                    break;
                case UPDATE:
                    System.out.println("This is update function");
                    int i = motorbikeService.findMotorbikeByNumberControl(MotorbikeView.inputNumberControlMotorBike());
                    if (i != -1) {
                        this.motorbikeService.update(i, MotorbikeView.inputForMotorBikeData());
                        System.out.println("Update car succeed");
                    } else {
                        System.out.println("Update car fail");
                    }
                    break;
                case DELETE:
                    System.out.println("This is delete function");
                    boolean resultDelete = this.motorbikeService.delete(MotorbikeView.inputNumberControlMotorBike());
                    if (resultDelete) {
                        System.out.println("Delete motorbike succeed");
                    }
                    break;
                case FIND:
                    System.out.println("This is find function");
                    Motorbike motorbikeFind = motorbikeService.find(MotorbikeView.inputNumberControlMotorBike());
                    if (motorbikeFind != null) {
                        System.out.println(motorbikeFind);
                    } else {
                        System.out.println("Can not find this motorbike");
                    }
                    break;
                default:
                    flag = false;
            }
        }
    }
}
