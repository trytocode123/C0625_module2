package furama.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Booking {

    private int iD;
    private static int count = 1;
    private LocalDate dateBooking;
    private LocalDate startDate;
    private LocalDate endDate;
    private String iDCustomer;
    private String iDService;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Booking() {
    }

    public Booking(LocalDate dateBooking, LocalDate startDate, LocalDate endDate, String iDCustomer, String iDService) {
        this.iD = generateAutoId();
        this.dateBooking = dateBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.iDCustomer = iDCustomer;
        this.iDService = iDService;
    }

    public int getId() {
        return iD;
    }

    public void setId(int iD) {
        this.iD = iD;
    }

    public LocalDate getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(LocalDate dateBooking) {
        this.dateBooking = dateBooking;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getIDCustomer() {
        return iDCustomer;
    }

    public void setIDCustomer(String iDCustomer) {
        this.iDCustomer = iDCustomer;
    }

    public String getIDService() {
        return iDService;
    }

    public void setIDService(String iDService) {
        this.iDService = iDService;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-12s | %-12s | %-13s | %-13s | %-10s |",
                iD,
                dateBooking.format(formatter),
                startDate.format(formatter),
                endDate.format(formatter),
                iDCustomer,
                iDService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId());
    }

    @Override
    public boolean equals(Object obj) {
        return ((Booking) obj).getId() == (this.getId());
    }

    public int generateAutoId() {
        return count++;
    }
}
