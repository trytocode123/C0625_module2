package furama.entity;

public class Employee extends Person {
    private String type;
    private String address;

    public Employee() {
    }

    public Employee(String iD, String fullName, String date, boolean gender, String identify, String phoneNumber, String email, String type, String address) {
        super(iD, fullName, date, gender, identify, phoneNumber, email);
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
        return "Employee{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
