package ss8_mvc.bai_1.service;

import ss8_mvc.bai_1.entity.Motorbike;
import ss8_mvc.bai_1.repository.MotorbikeRepository;

import java.util.ArrayList;

public class MotorbikeService implements IMotorbikeService {
    MotorbikeRepository motorbikeRepository = new MotorbikeRepository();

    @Override
    public ArrayList<Motorbike> findAll() {
        return motorbikeRepository.findAll();
    }

    @Override
    public boolean add(Motorbike motorbike) {
        return motorbikeRepository.add(motorbike);
    }

    @Override
    public boolean update() {
        return motorbikeRepository.update();
    }

    @Override
    public boolean delete() {
        return motorbikeRepository.delete();
    }

    @Override
    public Motorbike find() {
        return null;
    }
}
