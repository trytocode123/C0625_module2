package furama.entity;

import java.time.LocalDate;

public abstract class Person {
    //    Mã khách hàng, Họ
//    tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email,
    private String iD;
    private String fullName;
    private LocalDate date;
    private boolean gender;
    private String identifyNumber;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String iD, String fullName, LocalDate date, boolean gender, String identify, String phoneNumber, String email) {
        this.iD = iD;
        this.fullName = fullName;
        this.date = date;
        this.gender = gender;
        this.identifyNumber = identify;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getIdentifyNumber() {
        return identifyNumber;
    }

    public void setIdentifyNumber(String identifyNumber) {
        this.identifyNumber = identifyNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "iD='" + iD + '\'' +
                ", fullName='" + fullName + '\'' +
                ", date='" + date + '\'' +
                ", sex=" + gender +
                ", identify='" + identifyNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
