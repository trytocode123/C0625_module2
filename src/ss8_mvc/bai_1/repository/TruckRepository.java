package ss8_mvc.bai_1.repository;

import ss8_mvc.bai_1.entity.Motorbike;
import ss8_mvc.bai_1.entity.Truck;
import ss8_mvc.bai_1.view.TruckView;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TruckRepository implements ITruckRepository {
    static Scanner sc = new Scanner(System.in);
    private static final ArrayList<Truck> truckList = new ArrayList<>();

    static {
        truckList.add(new Truck("43C-11231", "Honda", 2019, "Nguyen Van A", 1));
        truckList.add(new Truck("75C-11212", "Honda", 2019, "Nguyen Van B", 2));
        truckList.add(new Truck("74C-11345", "Honda", 2019, "Nguyen Van C", 3));
        truckList.add(new Truck("92C-68678", "Honda", 2019, "Nguyen Van D", 4));
    }

    @Override
    public ArrayList<Truck> findAll() {
        return truckList;
    }

    int findTruckByNumberControl(String numberControl) {
        for (int i = 0; i < truckList.size(); i++) {
            if (Objects.equals(truckList.get(i).getControlNumber(), numberControl)) {
                return i;
            }
        }
        return -1;
    }


    static String inputNumberControlTruck() {
        System.out.println("Enter number control");
        return sc.nextLine();
    }

    @Override
    public boolean add(Truck truck) {
        truckList.add(truck);
        return true;
    }

    @Override
    public boolean update(String numberControlTruck) {
        if (findTruckByNumberControl(numberControlTruck) != -1) {
            int i = findTruckByNumberControl(numberControlTruck);
            truckList.set(i, TruckView.inputForTruckData());
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String numberControlTruck) {
        if (findTruckByNumberControl(numberControlTruck) != -1) {
            int i = findTruckByNumberControl(numberControlTruck);
            truckList.remove(i);
            return true;
        }
        return false;
    }

    @Override
    public Truck find(String numberControlTruck) {
        for (Truck truck : truckList) {
            if (Objects.equals(truck.getControlNumber(), numberControlTruck)) {
                return truck;
            }
        }
        return null;
    }
}
