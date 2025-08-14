package ss8_mvc.bai_1.repository;

import ss8_mvc.bai_1.entity.Truck;

import java.util.ArrayList;

public interface ITruckRepository {
    ArrayList<Truck> findAll();

    boolean add(Truck car);

    boolean update(int i, Truck truck);

    boolean delete(String numberControlTruck);

    Truck find(String numberControlTruck);
}
