package ss8_mvc.bai_1.repository;

import ss8_mvc.bai_1.entity.Motorbike;

import java.util.ArrayList;

public interface IMotorbikeRepository {
    ArrayList<Motorbike> findAll();

    boolean add(Motorbike motorbike);

    boolean update(String motorbikeControl);

    boolean delete(String motorbikeControl);

    Motorbike find(String motorbikeControl);
}
