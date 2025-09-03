package furama.repository;

import furama.entity.Facility;
import furama.entity.House;
import furama.entity.Room;
import furama.entity.Villa;
import ss8_mvc.bai_1.util.ReadFileAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class FacilityRepository implements IFacilityRepository {
//    private final static LinkedHashMap<Facility, Integer> list = new LinkedHashMap<>();
//
//    static {
//        Facility villa = new Villa("SVVL-0001", "Villa premium", 30.2, 2000000, 19, "Optional", 12.2f, "Standard", 3);
//        list.put(villa, list.getOrDefault(villa, 0));
//        Facility house = new House("SVHO-0001", "House premium", 30.2, 2000000, 19, "Optional", "Standard", 3);
//        list.put(house, list.getOrDefault(house, 0));
//        Facility room = new Room("SVRO-0001", "Room premium", 30.2, 2000000, 19, "Optional", "Optional");
//        list.put(room, list.getOrDefault(room, 0));
//    }

    final String pathFile = "src/furama/data/facility.csv";

    @Override
    public LinkedHashMap<Facility, Integer> findAll() {

        try {
            LinkedHashMap<Facility, Integer> list = new LinkedHashMap<>();
            String[] array = null;
            List<String> stringList = ReadFileAndWriteFile.readFileCSV(pathFile);
            for (String str : stringList) {
                array = str.split(",");
                if (array[0].startsWith("SVVL")) {
                    list.put(new Villa(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], Float.parseFloat(array[6]), array[7], Integer.parseInt(array[8])), Integer.parseInt(array[9]));
                } else if ((array[0].startsWith("SVRO"))) {
                    list.put(new Room(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], array[6]), Integer.parseInt(array[7]));
                } else {
                    list.put(new House(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], array[6], Integer.parseInt(array[7])), Integer.parseInt(array[8]));
                }
            }
            return list;
        } catch (IOException e) {
            System.out.println("Error of reading file");
            return null;
        }
    }

    @Override
    public boolean add(Facility facility, Integer value) {
        List<String> stringList = new ArrayList<>();
        stringList.add(facility.getInfoToCSV() + value);
        try {
            ReadFileAndWriteFile.writeFileCSV(pathFile, stringList, true);
        } catch (IOException e) {
            System.out.println("Error of writing file");
            return false;
        }
        return true;
    }
}
