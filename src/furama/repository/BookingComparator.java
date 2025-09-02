package furama.util;

import furama.entity.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getDateBooking().compareTo(o2.getDateBooking());
    }
}
