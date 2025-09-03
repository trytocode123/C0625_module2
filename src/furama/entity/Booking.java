package furama.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Booking {

    private String iD;
    private LocalDate dateBooking;
    private LocalDate startDate;
    private LocalDate endDate;
    private String iDCustomer;
    private String iDService;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Booking() {
    }

    public Booking(String iD, LocalDate dateBooking, LocalDate startDate, LocalDate endDate, String iDCustomer, String iDService) {
        this.iD = iD;
        this.dateBooking = dateBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.iDCustomer = iDCustomer;
        this.iDService = iDService;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
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
        return "Booking: " + "Id=" + iD + ", Date booking=" + dateBooking.format(formatter) + ", Start date=" + startDate.format(formatter) + ", End date=" + endDate.format(formatter) + ", Id customer=" + iDCustomer + ", Id service=" + iDService;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getiD());
    }

    @Override
    public boolean equals(Object obj) {
        return ((Booking) obj).getiD().equals(this.getiD());
    }
}
