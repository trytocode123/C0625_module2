package furama.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Customer extends Person {
    private String type;
    private String address;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Customer() {
    }

    public Customer(String iD, String fullName, LocalDate date, boolean gender, String identifyNumber, String phoneNumber, String email, String type, String address) {
        super(iD, fullName, date, gender, identifyNumber, phoneNumber, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "---Customer----\nID: " + this.getiD() + "\nFull name: " + this.getFullName() + "\nDate of birth: " + this.getDate().format(formatter) + "\nGender: " + (this.isGender() ? "Male" : "Female") + "\nIdentify: " + this.getIdentifyNumber() + "\nPhone number: " + this.getPhoneNumber() + "\nEmail: " + this.getEmail() + " \nType: " + this.getType() + "\nAddress: " + this.getAddress() + "\n";
    }

    public String getInfoToCSV() {
        return this.getiD() + "," + this.getFullName() + "," + this.getDate().format(formatter) + "," + (this.isGender() ? "Male" : "Female") + "," + this.getIdentifyNumber() + "," + this.getPhoneNumber() + "," + this.getEmail() + "," +
                this.getType() + "," + this.getAddress();
    }
}
