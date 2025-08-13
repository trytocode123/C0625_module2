package ss8_mvc.bai_1.service;

import ss8_mvc.bai_1.entity.Car;
import ss8_mvc.bai_1.repository.CarRepository;

import java.util.ArrayList;

public class CarService implements ICarService {
    CarRepository carRepository = new CarRepository();

    @Override
    public ArrayList<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public boolean add(Car car) {
        return carRepository.add(car);
    }

    @Override
    public boolean update() {
        return carRepository.update();
    }

    @Override
    public boolean delete() {
        return carRepository.delete();
    }

    @Override
    public Car find() {
        return null;
    }
}
