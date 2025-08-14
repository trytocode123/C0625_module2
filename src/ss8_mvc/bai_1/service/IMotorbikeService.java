package ss8_mvc.bai_1.service;

import ss8_mvc.bai_1.entity.Motorbike;

import java.util.ArrayList;

public interface IMotorbikeService {
    ArrayList<Motorbike> findAll();

    boolean add(Motorbike car);

    boolean update(String numberControlMotorbike);

    boolean delete(String numberControlMotorbike);

    Motorbike find(String numberControlMotorbike);
}
