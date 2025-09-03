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
        return "House {" +
                "ID='" + this.getiD() + '\'' +
                ", Name='" + this.getName() + '\'' +
                ", Area Use=" + this.getAreUse() + " m²" +
                ", Fee Rent=" + this.getFeeRent() + " VND" +
                ", People=" + this.getMaxQuantityPeople() +
                ", Type Rent='" + this.getTypeRent() + '\'' +
                ", Standard House='" + standardHouse + '\'' +
                ", Floors=" + numberFloor +
                '}';
    }


    public String toTableRow(int timeUsed) {
        return String.format("| %-10s | %-15s | %8.2f m² | %11.2f VND | %-6d | %-12s | %-17s | %-6d | %-12s | %-9s | %-15s | %-14s |",
                this.getiD(),
                this.getName(),
                this.getAreUse(),
                this.getFeeRent(),
                this.getMaxQuantityPeople(),
                this.getTypeRent(),
                standardHouse,
                numberFloor,
                "-",
                "-",
                "-",
                timeUsed + (timeUsed <= 1 ? " time" : " times"));
    }



    public String getInfoToCSV() {
        return this.getiD() + "," + this.getName() + "," + this.getAreUse() + "," + this.getFeeRent() + "," + this.getMaxQuantityPeople() + "," + this.getTypeRent() + "," + standardHouse + "," + numberFloor + ",";
    }
}
