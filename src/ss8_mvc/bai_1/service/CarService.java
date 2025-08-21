package ss8_mvc.bai_1.service;

import ss8_mvc.bai_1.entity.Car;
import ss8_mvc.bai_1.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

public class CarService implements ICarService {
    CarRepository carRepository = new CarRepository();

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public boolean add(Car car) {
        return carRepository.add(car);
    }

    @Override
    public boolean update(int i, Car car) {
        return carRepository.update(i, car);
    }

    @Override
    public boolean delete(String numberControlCar) {
        return carRepository.delete(numberControlCar);
    }

    @Override
    public List<String> find(String numberControlCar) {
        return carRepository.find(numberControlCar);
    }

    public int findCarByNumberControl(String numberControl) {
        return carRepository.findCarByNumberControl(numberControl);
    }

}
