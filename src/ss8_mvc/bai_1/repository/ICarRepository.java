package ss8_mvc.bai_1.repository;

import ss8_mvc.bai_1.entity.Car;

import java.util.ArrayList;
import java.util.List;

public interface ICarRepository {
    List<Car> findAll();

    boolean add(Car car);

    boolean update(int i, Car car);

    boolean delete(String numberControl);

    List<Car> find(String numberControl);
}
