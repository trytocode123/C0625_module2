package furama.entity;

public abstract class Facility {
    private String iD;
    private String name;
    private double areUse;
    private double feeRent;
    private int maxQuantityPeople;
    private String typeRent;

    public Facility() {
    }

    public Facility(String iD, String name, double areUse, double feeRent, int maxQuantityPeople, String typeRent) {
        this.iD = iD;
        this.name = name;
        this.areUse = areUse;
        this.feeRent = feeRent;
        this.maxQuantityPeople = maxQuantityPeople;
        this.typeRent = typeRent;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAreUse() {
        return areUse;
    }

    public void setAreUse(double areUse) {
        this.areUse = areUse;
    }

    public double getFeeRent() {
        return feeRent;
    }

    public void setFeeRent(double feeRent) {
        this.feeRent = feeRent;
    }

    public int getMaxQuantityPeople() {
        return maxQuantityPeople;
    }

    public void setMaxQuantityPeople(int maxQuantityPeople) {
        this.maxQuantityPeople = maxQuantityPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", areUse=" + areUse +
                ", feeRent=" + feeRent +
                ", maxQuantityPeople=" + maxQuantityPeople +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }

    public abstract String getInfoToCSV();
}
