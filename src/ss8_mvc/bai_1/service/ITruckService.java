package ss8_mvc.bai_1.service;

import ss8_mvc.bai_1.entity.Truck;

import java.util.ArrayList;

public interface ITruckService {
    ArrayList<Truck> findAll();

    boolean add(Truck truck);

    boolean update(int i, Truck truck);

    boolean delete(String numberControlTruck);

    Truck find(String numberControlTruck);

    int findTruckByNumberControl(String numberControl);
}
