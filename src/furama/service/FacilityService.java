package furama.service;

import furama.entity.Facility;
import furama.repository.FacilityRepository;

import java.util.LinkedHashMap;

public class FacilityService implements IFacilityService {
    FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public LinkedHashMap<Facility, Integer> findAll() {
        return facilityRepository.findAll();
    }

    @Override
    public boolean add(Facility facility, Integer value) {
        return facilityRepository.add(facility, value);
    }
}
