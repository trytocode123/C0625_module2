package furama.service;

import furama.entity.Booking;
import furama.entity.Facility;
import furama.repository.BookingRepository;

import java.util.LinkedHashMap;
import java.util.TreeSet;

public class BookingService implements IBookingService {
    BookingRepository bookingRepository = new BookingRepository();

    @Override
    public boolean add(Booking booking) {
        return bookingRepository.add(booking);
    }

    @Override
    public TreeSet<Booking> findAll() {
        return bookingRepository.findAll();
    }

    public void timeRent(LinkedHashMap<Facility, Integer> linkedHashMap) {
        bookingRepository.timeRent(linkedHashMap);
    }
}
