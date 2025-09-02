package furama.entity;

public class House extends Facility {
    private String standardHouse;
    private int numberFloor;

    public House() {
    }

    public House(String iD, String name, double areUse, double feeRent, int maxQuantityPeople, String typeRent, String standardHouse, int numberFloor) {
        super(iD, name, areUse, feeRent, maxQuantityPeople, typeRent);
        this.standardHouse = standardHouse;
        this.numberFloor = numberFloor;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "\n----House----" + "\nID: " + this.getiD() + "\nName: " + this.getName() + "\nArea use: " + this.getAreUse() + "m²"
                + "\nFee rent: " + this.getFeeRent() + "VND" + "\nMax quantity people: " + this.getMaxQuantityPeople()
                + "\nType: rent: " + this.getTypeRent() +
                "\nStandard house: " + standardHouse +
                "\nNumber floor: " + numberFloor + "\n";
    }
}
