package ss8_mvc.bai_1.entity;

public class Motorbike extends Vehicle {
    private double power;

    public Motorbike() {
    }

    public Motorbike(String controlNumber, String nameManufacturer, int yearManufacture, String nameOwner, double power) {
        super(controlNumber, nameManufacturer, yearManufacture, nameOwner);
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "power=" + power + " cc " +
                ", Control number='" + controlNumber + '\'' +
                ", Name manufacturer='" + nameManufacturer + '\'' +
                ", Year manufacture='" + yearManufacture + '\'' +
                ", Name owner='" + nameOwner + '\'' +
                '}';
    }
}
