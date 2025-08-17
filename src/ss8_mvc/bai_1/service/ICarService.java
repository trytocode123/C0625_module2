package ss8_mvc.bai_1.service;

import ss8_mvc.bai_1.entity.Car;

import java.util.ArrayList;

public interface ICarService {
    ArrayList<Car> findAll();

    boolean add(Car car);

    boolean update(int i, Car car);

    boolean delete(String numberControlCar);

    ArrayList<Car>  find(String numberControlCar);

    public int findCarByNumberControl(String numberControl);
}
