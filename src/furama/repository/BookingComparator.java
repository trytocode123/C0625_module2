package furama.repository;

import furama.entity.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        if (o1.getStartDate().isEqual(o2.getStartDate())) {
            return o1.getEndDate().compareTo(o2.getEndDate());
        }
        return o1.getStartDate().compareTo(o2.getStartDate());
    }
}
