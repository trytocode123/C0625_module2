package ss8_mvc.bai_1.entity;

public abstract class Vehicle {
    protected String controlNumber;
    protected String nameManufacturer;
    protected int yearManufacture;
    protected String nameOwner;

    public Vehicle() {
    }

    public Vehicle(String controlNumber, String nameManufacturer, int yearManufacture, String nameOwner) {
        this.controlNumber = controlNumber;
        this.nameManufacturer = nameManufacturer;
        this.yearManufacture = yearManufacture;
        this.nameOwner = nameOwner;
    }

    public String getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public abstract String getInfoToCSV();
}
