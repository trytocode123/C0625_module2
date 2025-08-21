package ss8_mvc.bai_1.repository;


import ss8_mvc.bai_1.entity.Motorbike;
import ss8_mvc.bai_1.entity.Truck;
import ss8_mvc.bai_1.util.ReadFileAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class TruckRepository implements ITruckRepository {

    final static String pathFile = "src/ss8_mvc/bai_1/data/truck.csv";

    @Override
    public List<Truck> findAll() {
        List<Truck> motorbikeList = new ArrayList<>();
        try {
            List<String> stringList = ReadFileAndWriteFile.readFileCSV(pathFile);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
                Truck truck = new Truck(array[0], array[1], Integer.parseInt(array[2]), array[3], Double.parseDouble(array[4]));
                motorbikeList.add(truck);
            }

        } catch (IOException e) {
            System.out.println("Error of reading file");
        }
        return motorbikeList;
    }

    public int findTruckByNumberControl(String numberControl) {
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
    public boolean add(Truck truck) {
        List<String> stringList = new ArrayList<>();
        try {
            stringList.add(truck.getInfoToCSV());
            ReadFileAndWriteFile.writeFileCSV(pathFile, stringList, true);
            return true;
        } catch (IOException e) {
            System.out.println("Error of reading file");
            return false;
        }
    }

    @Override
    public boolean update(int i, Truck truck) {

        List<String> stringList = null;
        try {
            stringList = ReadFileAndWriteFile.readFileCSV(pathFile);
            stringList.set(i, truck.getInfoToCSV());
            ReadFileAndWriteFile.writeFileCSV(pathFile, stringList, false);
        } catch (IOException e) {
            System.out.println("Error reading and writing");
        }

        return true;

    }

    @Override
    public boolean delete(String numberControlTruck) {
        int index = findTruckByNumberControl(numberControlTruck);
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
    public List<Truck> find(String numberControlTruck) {
        List<String> stringList = null;
        List<Truck> truckFindList = new ArrayList<>();
        try {
            String[] array = null;
            stringList = ReadFileAndWriteFile.readFileCSV(pathFile);
            for (String line : stringList) {
                array = line.split(",");
                if (array[0].contains(numberControlTruck)) {
//                    String controlNumber, String nameManufacturer, int yearManufacture, String nameOwner, double payload
                    truckFindList.add(new Truck(array[0], array[1], Integer.parseInt(array[2]), array[3], Double.parseDouble(array[4])));
                }
            }
            return truckFindList;
        } catch (IOException e) {
            System.out.println("Error of reading file");
        }
        return null;
    }
}
