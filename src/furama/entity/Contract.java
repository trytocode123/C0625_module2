package furama.entity;

public class Contract {

    private String numberContract;
    private String iD;
    private double advancePayment;
    private double totalPayment;

    public Contract() {
    }

    public Contract(String numberContract, String iD, double advancePayment, double totalPayment) {
        this.numberContract = numberContract;
        this.iD = iD;
        this.advancePayment = advancePayment;
        this.totalPayment = totalPayment;
    }

    public String getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(String numberContract) {
        this.numberContract = numberContract;
    }

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public double getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(double advancePayment) {
        this.advancePayment = advancePayment;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "\nNumber contract=" + numberContract +
                ",\nId: " + iD +
                ",\nDeposit=" + advancePayment +
                ",\nTotal payment=" + totalPayment +
                '}';
    }
}
