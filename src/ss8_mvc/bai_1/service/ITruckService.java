package ss8_mvc.bai_1.service;

import ss8_mvc.bai_1.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public interface ITruckService {
    List<Truck> findAll();

    boolean add(Truck truck);

    boolean update(int i, Truck truck);

    boolean delete(String numberControlTruck);

    List<Truck> find(String numberControlTruck);

    int findTruckByNumberControl(String numberControl);
}
