package furama.entity;

public class Contract {
    private static int count = 1;
    private int numberContract;
    private int iD;
    private double advancePayment;
    private double totalPayment;

    public Contract() {
    }

    public Contract(int iD, double advancePayment, double totalPayment) {
        numberContract = generateId();
        this.iD = iD;
        this.advancePayment = advancePayment;
        this.totalPayment = totalPayment;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
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
                "\nNumber contract: " + numberContract +
                ",\nId: " + iD +
                ",\nDeposit: " + advancePayment +
                ",\nTotal payment: " + totalPayment +
                "}\n";
    }

    private int generateId() {
        return count++;
    }
}
