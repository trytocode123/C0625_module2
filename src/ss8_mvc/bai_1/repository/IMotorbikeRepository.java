package ss8_mvc.bai_1.repository;

import ss8_mvc.bai_1.entity.Motorbike;

import java.util.List;

public interface IMotorbikeRepository {
    List<Motorbike> findAll();

    boolean add(Motorbike motorbike);

    boolean update(int i, Motorbike motorbike);

    boolean delete(String motorbikeControl);

    List<Motorbike> find(String motorbikeControl);
}
