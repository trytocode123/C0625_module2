package furama.entity;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String iD, String name, double areUse, double feeRent, int maxQuantityPeople, String typeRent, String freeService) {
        super(iD, name, areUse, feeRent, maxQuantityPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "\n----Room----" + "\nID: " + this.getiD() + "\nName: " + this.getName() + "\nArea use: " + this.getAreUse() + "m²"
                + "\nFee rent: " + this.getFeeRent() + "VND" + "\nMax quantity people: " + this.getMaxQuantityPeople()
                + "\nType rent: " + this.getTypeRent() +
                "\nFree service: " + freeService + "\n";
    }

    public String getInfoToCSV() {
        return this.getiD() + "," + this.getName() + "," + this.getAreUse() + "," + this.getFeeRent() + "," + this.getMaxQuantityPeople() + ","
                + this.getTypeRent() + "," + freeService + ",";
    }
}
