package furama.service;

import furama.entity.Booking;
import furama.entity.Facility;

import java.util.LinkedHashMap;
import java.util.TreeSet;

public interface IBookingService {
    boolean add(Booking booking);

    TreeSet<Booking> findAll();

    void timeRent(LinkedHashMap<Facility, Integer> linkedHashMap);
}
