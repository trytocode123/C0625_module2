package furama.repository;

import furama.entity.Booking;

import java.time.LocalDate;
import java.util.Stack;
import java.util.TreeSet;

import static furama.repository.BookingRepository.bookingTreeSet;
import static furama.repository.BookingRepository.formatter;

public class PromotionRepository implements IPromotionRepository {
    static TreeSet<Booking> promotionList = new TreeSet<>(new BookingComparator());

    BookingRepository bookingRepository = new BookingRepository();

    @Override
    public TreeSet<Booking> findAllByYear(int year) {
        TreeSet<Booking> bookings = bookingRepository.findAll();
        for (Booking booking : bookings) {
            if (booking.getDateBooking().getYear() == year) {
                promotionList.add(booking);
            }
        }
        return promotionList;
    }

    public Stack<Booking> findAllVoucher() {
        Stack<Booking> bookingStack = new Stack<>();
        TreeSet<Booking> bookings = bookingRepository.findAll();

        for (Booking booking : bookings) {
            if (booking.getDateBooking().getMonthValue() == LocalDate.now().getMonthValue()
                    && booking.getDateBooking().getYear() == LocalDate.now().getYear()) {
                promotionList.add(booking);
            }
        }
        bookingStack.addAll(promotionList);
        return bookingStack;
    }
}
