package ss8_mvc.bai_1.repository;

import ss8_mvc.bai_1.entity.Truck;

import java.util.List;

public interface ITruckRepository {
    List<Truck> findAll();

    boolean add(Truck car);

    boolean update(int i, Truck truck);

    boolean delete(String numberControlTruck);

    List<Truck> find(String numberControlTruck);
}
