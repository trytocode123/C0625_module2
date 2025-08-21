package ss8_mvc.bai_1.service;

import ss8_mvc.bai_1.entity.Motorbike;

import java.util.List;

public interface IMotorbikeService {
    List<Motorbike> findAll();

    boolean add(Motorbike car);

    boolean update(int i, Motorbike motorbike);

    boolean delete(String numberControlMotorbike);

    List<Motorbike> find(String numberControlMotorbike);

    public int findMotorbikeByNumberControl(String numberControl);
}
