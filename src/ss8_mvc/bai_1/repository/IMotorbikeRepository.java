package ss8_mvc.bai_1.repository;

import ss8_mvc.bai_1.entity.Motorbike;

import java.util.ArrayList;

public interface IMotorbikeRepository {
    ArrayList<Motorbike> findAll();

    boolean add(Motorbike motorbike);

    boolean update(int i, Motorbike motorbike);

    boolean delete(String motorbikeControl);

    ArrayList<Motorbike> find(String motorbikeControl);
}
