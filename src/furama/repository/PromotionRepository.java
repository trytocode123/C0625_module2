package furama.repository;

import furama.entity.Booking;


import java.time.LocalDate;
import java.util.Stack;
import java.util.TreeSet;

import static furama.repository.BookingRepository.bookingTreeSet;
import static furama.repository.BookingRepository.formatter;

public class PromotionRepository implements IPromotionRepository {
    static TreeSet<Booking> promotionList = new TreeSet<>(new BookingComparator());

    static {
        bookingTreeSet.add(new Booking("1", LocalDate.parse("12/12/2025", formatter), LocalDate.parse("13/12/2025", formatter), LocalDate.parse("15/12/2025", formatter), "KH-4444", "SVVL-1111"));
        bookingTreeSet.add(new Booking("2", LocalDate.parse("14/12/2024", formatter), LocalDate.parse("15/12/2025", formatter), LocalDate.parse("17/12/2025", formatter), "KH-2112", "SVVL-00001"));
    }

    BookingRepository bookingRepository = new BookingRepository();


    @Override
    public TreeSet<Booking> findAllByYear(int year) {
        TreeSet<Booking> bookings = bookingRepository.findAll();
        for (Booking booking : promotionList) {
            if (booking.getDateBooking().getYear() == year) {
                bookings.add(booking);
            }
        }
        return bookings;
    }

    public Stack<Booking> findAllVoucher() {
        Stack<Booking> bookingStack = new Stack<>();
        TreeSet<Booking> bookings = bookingRepository.findAll();
        TreeSet<Booking> bookingSort = new TreeSet<>(new BookingComparator());

        for (Booking booking : bookings) {
            if (booking.getDateBooking().getMonthValue() == LocalDate.now().getMonthValue()
                    && booking.getDateBooking().getYear() == LocalDate.now().getYear()) {
                bookingSort.add(booking);
            }
        }
        bookingStack.addAll(bookingSort);
        return bookingStack;
    }
}
