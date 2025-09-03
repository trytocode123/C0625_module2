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
        return "\n----Villa----" + "\nID: " + this.getiD() + "\nName: " + this.getName() + "\nArea use: " + this.getAreUse() + " m²"
                + "\nFee rent: " + this.getFeeRent() + "VND" + "\nMax quantity people: " + this.getMaxQuantityPeople()
                + "\nType: rent: " + this.getTypeRent() +
                "\nArea pool: " + areaPool + " m²" +
                "\nStandard villa: " + standardVilla +
                "\nNumber floor: " + numberFloor + "\n";
    }

    public String getInfoToCSV() {
        return this.getiD() + "," + this.getName() + "," + this.getAreUse() + "," + this.getFeeRent() + "," + this.getMaxQuantityPeople() + ","
                + this.getTypeRent() + "," + areaPool + "," + standardVilla + "," + numberFloor + ",";
    }

}
