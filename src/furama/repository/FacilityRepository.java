package furama.repository;

import furama.entity.Facility;
import furama.entity.House;
import furama.entity.Room;
import furama.entity.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private final static LinkedHashMap<Facility, Integer> list = new LinkedHashMap<>();

    static {
        Facility villa = new Villa("SVVL-0001", "Villa premium", 30.2, 2000000, 19, "Optional", 12.2f, "Standard", 3);
        list.put(villa, list.getOrDefault(villa, 0));
        Facility house = new House("SVHO-0001", "House premium", 30.2, 2000000, 19, "Optional", "Standard", 3);
        list.put(house, list.getOrDefault(house, 0));
        Facility room = new Room("SVRO-0001", "Room premium", 30.2, 2000000, 19, "Optional", "Optional");
        list.put(room, list.getOrDefault(room, 0));
    }

    @Override
    public LinkedHashMap<Facility, Integer> findAll() {
        return list;
    }

    @Override
    public boolean add(Facility facility, Integer value) {
        list.put(facility, value);
        return true;
    }


}
