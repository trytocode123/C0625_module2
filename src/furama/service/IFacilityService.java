package furama.service;

import furama.entity.Facility;

import java.util.LinkedHashMap;

public interface IFacilityService {
    LinkedHashMap<Facility, Integer> findAll();

    boolean add(Facility facility, Integer value);

}
