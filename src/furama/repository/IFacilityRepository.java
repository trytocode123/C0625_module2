package furama.repository;

import furama.entity.Facility;

import java.util.LinkedHashMap;

public interface IFacilityRepository {
    LinkedHashMap<Facility, Integer> findAll();

    boolean add(Facility facility, Integer value);
}
