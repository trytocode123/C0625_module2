package ss8_mvc.bai_1.service;

import ss8_mvc.bai_1.entity.Truck;

import ss8_mvc.bai_1.repository.TruckRepository;

import java.util.ArrayList;

public class TruckService implements ITruckService {
    TruckRepository truckRepository = new TruckRepository();

    @Override
    public ArrayList<Truck> findAll() {
        return truckRepository.findAll();
    }

    @Override
    public boolean add(Truck motorbike) {
        return truckRepository.add(motorbike);
    }

    @Override
    public boolean update(int i, Truck truck) {
        return truckRepository.update(i, truck);
    }

    @Override
    public boolean delete(String numberControlTruck) {
        return truckRepository.delete(numberControlTruck);
    }

    @Override
    public ArrayList<Truck> find(String numberControlTruck) {
        return truckRepository.find(numberControlTruck);
    }

    public int findTruckByNumberControl(String numberControl) {
        return truckRepository.findTruckByNumberControl(numberControl);
    }
}
