package ss8_mvc.bai_1.service;

import ss8_mvc.bai_1.entity.Car;

import java.util.ArrayList;
import java.util.List;

public interface ICarService {
    List<Car> findAll();

    boolean add(Car car);

    boolean update(int i, Car car);

    boolean delete(String numberControlCar);

    List<String> find(String numberControlCar);

    public int findCarByNumberControl(String numberControl);
}
