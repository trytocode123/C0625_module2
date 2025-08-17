package ss8_mvc.bai_1.repository;


import ss8_mvc.bai_1.entity.Truck;

import java.util.ArrayList;
import java.util.Objects;


public class TruckRepository implements ITruckRepository {

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

    public int findTruckByNumberControl(String numberControl) {
        for (int i = 0; i < truckList.size(); i++) {
            if (Objects.equals(truckList.get(i).getControlNumber(), numberControl)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean add(Truck truck) {
        truckList.add(truck);
        return true;
    }

    @Override
    public boolean update(int i, Truck truck) {

        truckList.set(i, truck);
        return true;

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
    public ArrayList<Truck> find(String numberControlTruck) {
        ArrayList<Truck> truckFindList = new ArrayList<>();
        for (Truck truck : truckList) {
            if (truck.getControlNumber().contains(numberControlTruck)) {
                truckFindList.add(truck);
            }
        }
        if (!truckFindList.isEmpty()) {
            return truckFindList;
        }
        return null;
    }
}
