package ss8_mvc.bai_1.controller;

import ss8_mvc.bai_1.entity.Car;
import ss8_mvc.bai_1.entity.Motorbike;
import ss8_mvc.bai_1.service.CarService;
import ss8_mvc.bai_1.service.ICarService;
import ss8_mvc.bai_1.view.CarView;
import ss8_mvc.bai_1.view.MotorbikeView;

import java.util.ArrayList;
import java.util.Scanner;

public class CarController {
    private ICarService carService = new CarService();

    public void displayMenu() {
        final int DISPLAY = 1;
        final int ADD = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int FIND = 5;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("----Manage car----\n1. Display list of car\n2. Add car\n3. Update car\n4. Delete car\n5. Find car\n6. Back to main menu");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case DISPLAY:
                    ArrayList<Car> cars = this.carService.findAll();
                    CarView.display(cars);
                    break;
                case ADD:
                    System.out.println("This is add function");
                    Car car = CarView.inputForCarData();
                    boolean resultAdd = this.carService.add(car);
                    if (resultAdd) {
                        System.out.println("Add car succeed");
                    }
                    break;
                case UPDATE:
                    System.out.println("This is update function");
                    int i = carService.findCarByNumberControl(CarView.inputNumberControlCar());
                    if (i != -1) {
                        this.carService.update(i, CarView.inputForCarData());
                        System.out.println("Update car succeed");
                    } else {
                        System.out.println("Update car fail");
                    }
                    break;
                case DELETE:
                    System.out.println("This is delete function");
                    boolean resultDelete = this.carService.delete(CarView.inputNumberControlCar());
                    if (resultDelete) {
                        System.out.println("Delete car succeed");
                    } else {
                        System.out.println("Delete car fail");
                    }
                    break;
                case FIND:
                    System.out.println("This is find function");
                    Car carFind = carService.find(CarView.inputNumberControlCar());
                    if (carFind != null) {
                        System.out.println(carFind);
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
