package ss8_mvc.bai_1.repository;

import ss8_mvc.bai_1.entity.Car;

import java.util.ArrayList;

public interface ICarRepository {
    ArrayList<Car> findAll();
    boolean add(Car car);
    boolean update();
    boolean delete();
    Car find();
}
