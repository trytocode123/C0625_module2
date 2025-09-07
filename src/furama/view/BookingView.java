package furama.view;

import furama.entity.Booking;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeSet;

public class BookingView {
    public static void display(TreeSet<Booking> bookings) {
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    public static Booking inputForBooking() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        LocalDate dateBooking;
        do {
            System.out.println("Enter date");
            try {
                dateBooking = LocalDate.parse(sc.nextLine(), dateTimeFormatter);
                break;
            } catch (DateTimeException e) {
                System.err.println(e.getMessage());
            }
        } while (true);

        LocalDate startDate;
        do {
            System.out.println("Enter start date");
            try {
                startDate = LocalDate.parse(sc.nextLine(), dateTimeFormatter);
                break;
            } catch (DateTimeException e) {
                System.err.println(e.getMessage());
            }
        } while (true);

        LocalDate endDate;
        do {
            System.out.println("Enter end date");
            try {
                endDate = LocalDate.parse(sc.nextLine(), dateTimeFormatter);
                break;
            } catch (DateTimeException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
        System.out.println("Enter id customer");
        String iDCustomer = sc.nextLine();
        System.out.println("Enter id service");
        String iDService = sc.nextLine();
        return new Booking(dateBooking, startDate, endDate, iDCustomer, iDService);
    }
}
