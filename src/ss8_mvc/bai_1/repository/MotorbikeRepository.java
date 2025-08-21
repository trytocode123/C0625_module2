package ss8_mvc.bai_1.repository;


import ss8_mvc.bai_1.entity.Motorbike;
import ss8_mvc.bai_1.util.ReadFileAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MotorbikeRepository implements IMotorbikeRepository {

    final static String pathFile = "src/ss8_mvc/bai_1/data/motorbike.csv";


    @Override
    public List<Motorbike> findAll() {
        List<Motorbike> motorbikeList = new ArrayList<>();
        try {
            List<String> stringList = ReadFileAndWriteFile.readFileCSV(pathFile);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
                //    String controlNumber, String nameManufacturer, int yearManufacture, String nameOwner, double power
                Motorbike motorbike = new Motorbike(array[0], array[1], Integer.parseInt(array[2]), array[3], Double.parseDouble(array[4]));
                motorbikeList.add(motorbike);
            }

        } catch (IOException e) {
            System.out.println("Error of reading file");
        }
        return motorbikeList;
    }

    public int findMotorbikeByNumberControl(String numberControl) {
        List<String> stringList = null;
        try {
            stringList = ReadFileAndWriteFile.readFileCSV(pathFile);
            String[] array = null;
            for (int i = 0; i < stringList.size(); i++) {
                array = stringList.get(i).split(",");
                for (String str : array) {
                    if (str.equals(numberControl)) {
                        return i;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error of reading file");
        }
        return -1;
    }

    @Override
    public boolean add(Motorbike motorbike) {
        List<String> stringList = new ArrayList<>();
        try {
            stringList.add(motorbike.getInfoToCSV());
            ReadFileAndWriteFile.writeFileCSV(pathFile, stringList, true);
            return true;
        } catch (IOException e) {
            System.out.println("Error of reading file");
        }

        return false;
    }

    @Override
    public boolean update(int i, Motorbike motorbike) {
        List<String> stringList = null;
        try {
            stringList = ReadFileAndWriteFile.readFileCSV(pathFile);
            stringList.set(i, motorbike.getInfoToCSV());
            ReadFileAndWriteFile.writeFileCSV(pathFile, stringList, false);
        } catch (IOException e) {
            System.out.println("Error reading and writing");
        }

        return true;
    }

    @Override
    public boolean delete(String numberControlMotorbike) {
        int index = findMotorbikeByNumberControl(numberControlMotorbike);
        List<String> stringList = null;
        try {
            if (index != -1) {
                stringList = ReadFileAndWriteFile.readFileCSV(pathFile);
                stringList.remove(index);
                ReadFileAndWriteFile.writeFileCSV(pathFile, stringList, false);
                return true;
            }
        } catch (IOException e) {
            System.out.println("Error of reading file");
        }
        return false;
    }

    @Override
    public List<Motorbike> find(String numberControlMotorbike) {
        List<String> stringList = null;
        List<Motorbike> motorbkeFindList = new ArrayList<>();
        try {
            String[] array = null;
            stringList = ReadFileAndWriteFile.readFileCSV(pathFile);
            for (String line : stringList) {
                array = line.split(",");
                if (array[0].contains(numberControlMotorbike)) {
                    motorbkeFindList.add(new Motorbike(array[0], array[1], Integer.parseInt(array[2]), array[3], Double.parseDouble(array[4])));
                }
            }
            return motorbkeFindList;
        } catch (IOException e) {
            System.out.println("Error of reading file");
        }
        return null;
    }
}

