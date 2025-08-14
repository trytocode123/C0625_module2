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
    public boolean update(String numberControlCar) {
        return carRepository.update(numberControlCar);
    }

    @Override
    public boolean delete(String numberControlCar) {
        return carRepository.delete(numberControlCar);
    }

    @Override
    public Car find(String numberControlCar) {
        return carRepository.find(numberControlCar);
    }
}
