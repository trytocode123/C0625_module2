package furama.repository;

import furama.entity.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        if (o1.getDateBooking().compareTo(o2.getDateBooking()) == 0) {
            return o2.getEndDate().compareTo(o1.getEndDate());
        }
        return o1.getDateBooking().compareTo(o2.getDateBooking());
    }
}
