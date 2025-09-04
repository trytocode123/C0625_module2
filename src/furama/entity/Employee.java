package furama.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee extends Person {
    private String level;
    private String position;
    private int salary;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Employee() {
    }

    public Employee(String iD, String fullName, LocalDate date, boolean gender, String identify, String phoneNumber, String email, String level, String position, int salary) {
        super(iD, fullName, date, gender, identify, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + "\nID: " + this.getiD() + "\nFull name: " + this.getFullName() + "\nDate of birth: " + this.getDate().format(formatter) + "\nGender: " + (this.isGender() ? "Male" : "Female") + "\nIdentify: " + this.getIdentifyNumber() + "\nPhone number: " + this.getPhoneNumber() + "\nEmail: " + this.getEmail() + " \nLevel: " + this.getLevel() + "\nPosition: " + this.getPosition() + "\nSalary: " + this.getSalary() + "\n";
    }

    public String getInfoToCSV() {
        return this.getiD() + "," + this.getFullName() + "," + this.getDate().format(formatter) + "," + (this.isGender() ? "Male" : "Female") + "," + this.getIdentifyNumber() + "," + this.getPhoneNumber() + "," + this.getEmail() + "," + this.getLevel() + "," + this.getPosition() + "," + this.getSalary();
    }
}
