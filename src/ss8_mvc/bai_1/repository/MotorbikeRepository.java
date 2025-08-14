package ss8_mvc.bai_1.repository;

import ss8_mvc.bai_1.entity.Motorbike;
import ss8_mvc.bai_1.view.MotorbikeView;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MotorbikeRepository implements IMotorbikeRepository {
    static Scanner sc = new Scanner(System.in);
    private static final ArrayList<Motorbike> motorList = new ArrayList<>();

    static {
        motorList.add(new Motorbike("43C-11231", "Honda", 2019, "Nguyen Van A", 125));
        motorList.add(new Motorbike("75C-11212", "Honda", 2019, "Nguyen Van B", 125));
        motorList.add(new Motorbike("74C-11345", "Honda", 2019, "Nguyen Van C", 125));
        motorList.add(new Motorbike("92C-68678", "Honda", 2019, "Nguyen Van D", 125));
    }

    @Override
    public ArrayList<Motorbike> findAll() {
        return motorList;
    }

    int findMotorByNumberControl(String numberControl) {
        for (int i = 0; i < motorList.size(); i++) {
            if (Objects.equals(motorList.get(i).getControlNumber(), numberControl)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean add(Motorbike motorbike) {
        motorList.add(motorbike);
        return true;
    }

    @Override
    public boolean update(String numberControlMotorbike) {
        if (findMotorByNumberControl(numberControlMotorbike) != -1) {
            int i = findMotorByNumberControl(numberControlMotorbike);
            motorList.set(i, MotorbikeView.inputForMotorBikeData());
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String numberControlMotorbike) {
        if (findMotorByNumberControl(numberControlMotorbike) != -1) {
            int i = findMotorByNumberControl(numberControlMotorbike);
            motorList.remove(i);
            return true;
        }
        return false;
    }

    @Override
    public Motorbike find(String numberControlMotorbike) {
        for (Motorbike motorbike : motorList){
            if(Objects.equals(motorbike.getControlNumber(), numberControlMotorbike)) {
                return motorbike;
            }
        }
        return null;
    }
}
