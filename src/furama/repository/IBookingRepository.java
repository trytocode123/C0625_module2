package furama.repository;

import furama.entity.Booking;

import java.util.TreeSet;

public interface IBookingRepository {
    boolean add(Booking booking);

    TreeSet<Booking> findAll();
}
