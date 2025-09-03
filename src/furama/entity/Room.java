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
        return "Room {" +
                "ID='" + this.getiD() + '\'' +
                ", Name='" + this.getName() + '\'' +
                ", Area Use=" + this.getAreUse() + " m²" +
                ", Fee Rent=" + this.getFeeRent() + " VND" +
                ", People=" + this.getMaxQuantityPeople() +
                ", Type Rent='" + this.getTypeRent() + '\'' +
                ", Free Service='" + freeService + '\'' +
                '}';
    }



    public String toTableRow(int timeUsed) {
        return String.format("| %-10s | %-15s | %8.2f m² | %11.2f VND | %-6d | %-12s | %-17s | %-6s | %-12s | %-9s | %-15s | %-14s |",
                this.getiD(),
                this.getName(),
                this.getAreUse(),
                this.getFeeRent(),
                this.getMaxQuantityPeople(),
                this.getTypeRent(),
                "-",
                "-",
                freeService,
                "-",
                "-",
                timeUsed + (timeUsed <= 1 ? " time" : " times"));
    }


    public String getInfoToCSV() {
        return this.getiD() + "," + this.getName() + "," + this.getAreUse() + "," + this.getFeeRent() + "," + this.getMaxQuantityPeople() + ","
                + this.getTypeRent() + "," + freeService + ",";
    }
}
