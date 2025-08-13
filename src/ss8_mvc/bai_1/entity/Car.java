package ss8_mvc.bai_1.entity;

public class Car extends Vehicle {
    private int numberSeat;
    private String typeCar;

    public Car() {
    }

    public Car(String controlNumber, String nameManufacturer, int yearManufacture, String nameOwner, int numberSeat, String typeCar) {
        super(controlNumber, nameManufacturer, yearManufacture, nameOwner);
        this.numberSeat = numberSeat;
        this.typeCar = typeCar;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Type Car='" + typeCar + '\'' +
                ", Control number='" + controlNumber + '\'' +
                ", Name manufacturer='" + nameManufacturer + '\'' +
                ", Year manufacture='" + yearManufacture + '\'' +
                ", Name owner='" + nameOwner + '\'' +
                '}';
    }
}
