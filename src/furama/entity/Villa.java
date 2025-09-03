package furama.entity;

public class Villa extends Facility {
    private float areaPool;
    private String standardVilla;
    private int numberFloor;


    public Villa() {
    }

    public Villa(String iD, String name, double areUse, double feeRent, int maxQuantityPeople, String typeRent, float areaPool, String standardVilla, int numberFloor) {
        super(iD, name, areUse, feeRent, maxQuantityPeople, typeRent);
        this.areaPool = areaPool;
        this.standardVilla = standardVilla;
        this.numberFloor = numberFloor;
    }

    public float getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(float areaPool) {
        this.areaPool = areaPool;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Villa {" +
                "ID='" + this.getiD() + '\'' +
                ", Name='" + this.getName() + '\'' +
                ", Area Use=" + this.getAreUse() + " m²" +
                ", Fee Rent=" + this.getFeeRent() + " VND" +
                ", People=" + this.getMaxQuantityPeople() +
                ", Type Rent='" + this.getTypeRent() + '\'' +
                ", Pool Area=" + areaPool + " m²" +
                ", Standard Villa='" + standardVilla + '\'' +
                ", Floors=" + numberFloor +
                '}';
    }

    public String toTableRow(int timeUsed) {
        return String.format(
                "| %-10s | %-15s | %8.2f m² | %11.2f VND | %-6d | %-12s | %-17s | %-6d | %-12s | %-9s | %-15s | %-14s |",
                this.getiD(),
                this.getName(),
                this.getAreUse(),
                this.getFeeRent(),
                this.getMaxQuantityPeople(),
                this.getTypeRent(),
                "-",
                numberFloor,
                "-",
                areaPool,
                standardVilla,
                timeUsed + (timeUsed <= 1 ? " time" : " times")
        );
    }

    public String getInfoToCSV() {
        return this.getiD() + "," + this.getName() + "," + this.getAreUse() + "," + this.getFeeRent() + "," + this.getMaxQuantityPeople() + ","
                + this.getTypeRent() + "," + areaPool + "," + standardVilla + "," + numberFloor + ",";
    }

}
