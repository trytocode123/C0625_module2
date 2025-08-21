package ss8_mvc.bai_1.entity;

public class Truck extends Vehicle {
    private double payload;

    public Truck() {
    }

    @Override
    public String getInfoToCSV() {
        return this.controlNumber + "," + nameManufacturer + "," + yearManufacture + "," + nameOwner + "," + payload;
    }

    public Truck(String controlNumber, String nameManufacturer, int yearManufacture, String nameOwner, double payload) {
        super(controlNumber, nameManufacturer, yearManufacture, nameOwner);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Payload=" + payload + " ton " +
                ", Control number='" + controlNumber + '\'' +
                ", Name manufacturer='" + nameManufacturer + '\'' +
                ", Year manufacture='" + yearManufacture + '\'' +
                ", Name owner='" + nameOwner + '\'' +
                '}';
    }
}
