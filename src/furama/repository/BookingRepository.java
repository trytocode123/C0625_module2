package furama.repository;

import furama.entity.Booking;
import furama.entity.Facility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    final static TreeSet<Booking> bookingTreeSet = new TreeSet<>(new BookingComparator());
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    static {
        bookingTreeSet.add(new Booking("1", LocalDate.parse("12/12/2025", formatter), LocalDate.parse("13/12/2025", formatter), LocalDate.parse("15/12/2025", formatter), "KH-4444", "SVVL-1111"));
        bookingTreeSet.add(new Booking("2", LocalDate.parse("14/12/2025", formatter), LocalDate.parse("15/12/2025", formatter), LocalDate.parse("17/12/2025", formatter), "KH-2112", "SVVL-00001"));
        bookingTreeSet.add(new Booking("3", LocalDate.parse("11/12/2025", formatter), LocalDate.parse("12/12/2025", formatter), LocalDate.parse("30/12/2025", formatter), "KH-5412", "SVVL-01111"));
        bookingTreeSet.add(new Booking("4", LocalDate.parse("02/09/2025", formatter), LocalDate.parse("27/12/2025", formatter), LocalDate.parse("29/12/2025", formatter), "KH-2424", "SVVL-1234"));
        bookingTreeSet.add(new Booking("5", LocalDate.parse("10/09/2025", formatter), LocalDate.parse("11/09/2025", formatter), LocalDate.parse("02/12/2025", formatter), "KH-2400", "SVVL-1234"));
        bookingTreeSet.add(new Booking("6", LocalDate.parse("17/09/2025", formatter), LocalDate.parse("18/09/2025", formatter), LocalDate.parse("03/12/2025", formatter), "KH-3113", "SVVL-1234"));
        bookingTreeSet.add(new Booking("7", LocalDate.parse("11/09/2025", formatter), LocalDate.parse("13/09/2025", formatter), LocalDate.parse("04/12/2025", formatter), "KH-4211", "SVVL-1234"));
        bookingTreeSet.add(new Booking("8", LocalDate.parse("09/09/2025", formatter), LocalDate.parse("10/09/2025", formatter), LocalDate.parse("05/12/2025", formatter), "KH-0001", "SVVL-1234"));
    }

    @Override
    public boolean add(Booking booking) {
        return bookingTreeSet.add(booking);
    }

    @Override
    public TreeSet<Booking> findAll() {
        return bookingTreeSet;
    }

    public void timeRent(LinkedHashMap<Facility, Integer> linkedHashMap) {
        for (Map.Entry<Facility, Integer> entry : linkedHashMap.entrySet()) {
            entry.setValue(0);
            for (Booking booking : bookingTreeSet) {
                if (booking.getIDService().equals(entry.getKey().getiD())) {
                    entry.setValue(entry.getValue() + 1);
                }
            }
        }
    }
}
