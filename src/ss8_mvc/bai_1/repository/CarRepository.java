package ss8_mvc.bai_1.repository;

import ss8_mvc.bai_1.entity.Car;
import ss8_mvc.bai_1.util.ReadFileAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CarRepository implements ICarRepository {
    final static String pathFile = "src/ss8_mvc/bai_1/data/car.csv";

    @Override
    public List<Car> findAll() {
        List<Car> carList = new ArrayList<>();
        try {
            List<String> stringList = ReadFileAndWriteFile.readFileCSV(pathFile);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
//              String controlNumber, String nameManufacturer, int yearManufacture, String nameOwner, int numberSeat, String typeCar
                Car car = new Car(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]), array[5]);
                carList.add(car);
            }

        } catch (IOException e) {
            System.out.println("Error of reading file");
        }
        return carList;
    }

    public int findCarByNumberControl(String numberControl) {
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
    public boolean add(Car car) {
        List<String> stringList = new ArrayList<>();
        try {
            stringList.add(car.getInfoToCSV());
            ReadFileAndWriteFile.writeFileCSV(pathFile, stringList, true);
            return true;
        } catch (IOException e) {
            System.out.println("Error of reading file");
        }

        return false;
    }

    @Override
    public boolean update(int i, Car car) {
        List<String> stringList = null;
        try {
            stringList = ReadFileAndWriteFile.readFileCSV(pathFile);
            stringList.set(i, car.getInfoToCSV());
            ReadFileAndWriteFile.writeFileCSV(pathFile, stringList, false);
        } catch (IOException e) {
            System.out.println("Error reading and writing");
        }

        return true;
    }

    @Override
    public boolean delete(String numberControlCar) {
        int index = findCarByNumberControl(numberControlCar);
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
    public List<Car> find(String numberControlCar) {
        List<String> stringList = null;
        List<Car> carFindList = new ArrayList<>();
        try {
            String[] array = null;
            stringList = ReadFileAndWriteFile.readFileCSV(pathFile);
            for (String line : stringList) {
                array = line.split(",");
                if (array[0].contains(numberControlCar)) {
                    carFindList.add(new Car(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]), array[5]));
                }
            }
            return carFindList;
        } catch (IOException e) {
            System.out.println("Error of reading file");
        }
        return null;
    }
}
