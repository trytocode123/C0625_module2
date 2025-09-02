package furama.service;

import furama.entity.Booking;

import java.util.TreeSet;

public interface IBookingService {
    boolean add(Booking booking);
    TreeSet<Booking> findAll();
}
