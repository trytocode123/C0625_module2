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
    public boolean update() {
        return truckRepository.update();
    }

    @Override
    public boolean delete() {
        return truckRepository.delete();
    }

    @Override
    public Truck find() {
        return null;
    }
}
