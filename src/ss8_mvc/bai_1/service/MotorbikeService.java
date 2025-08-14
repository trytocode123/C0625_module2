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
    public boolean update(int i, Motorbike motorbike) {
        return motorbikeRepository.update(i, motorbike);
    }

    @Override
    public boolean delete(String numberControlMotorbike) {
        return motorbikeRepository.delete(numberControlMotorbike);
    }

    @Override
    public Motorbike find(String numberControlMotorbike) {
        return motorbikeRepository.find(numberControlMotorbike);
    }

    public int findMotorbikeByNumberControl(String numberControl) {
        return motorbikeRepository.findMotorbikeByNumberControl(numberControl);
    }
}
