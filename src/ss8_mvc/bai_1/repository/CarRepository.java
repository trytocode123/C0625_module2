package ss8_mvc.bai_1.repository;

import ss8_mvc.bai_1.entity.Car;
import ss8_mvc.bai_1.view.CarView;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CarRepository implements ICarRepository {
    static Scanner sc = new Scanner(System.in);
    private static final ArrayList<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("43C-11231", "Honda", 2019, "Nguyen Van A", 12, "Passenger bus"));
        carList.add(new Car("75C-14444", "Hyundai", 2019, "Nguyen Van B", 12, "Tour bus"));
        carList.add(new Car("74C-13333", "Ika", 2019, "Nguyen Van C", 12, "Tour bus"));
        carList.add(new Car("92C-18787", "Mecsides", 2019, "Nguyen Van D", 12, "Passenger bus"));
    }

    @Override
    public ArrayList<Car> findAll() {
        return carList;
    }

    int findCarByNumberControl(String numberControl) {
        for (int i = 0; i < carList.size(); i++) {
            if (Objects.equals(carList.get(i).getControlNumber(), numberControl)) {
                return i;
            }
        }
        return -1;
    }


    static String inputNumberControlCar() {
        System.out.println("Enter number control");
        return sc.nextLine();
    }

    @Override
    public boolean add(Car car) {
        carList.add(car);
        return true;
    }

    @Override
    public boolean update() {
        String numberControl = inputNumberControlCar();
        if (findCarByNumberControl(numberControl) != -1) {
            int i = findCarByNumberControl(numberControl);
            carList.set(i, CarView.inputForCarData());
            return true;
        }
        return false;
    }

    @Override
    public boolean delete() {
        String numberControl = inputNumberControlCar();
        if (findCarByNumberControl(numberControl) != -1) {
            int i = findCarByNumberControl(numberControl);
            carList.remove(i);
            return true;
        }
        return false;
    }

    @Override
    public Car find() {
        return null;
    }
}
