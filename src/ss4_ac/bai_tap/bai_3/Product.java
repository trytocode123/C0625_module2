package ss4_ac.bai_tap.bai_3;

public class Product {
    private int iD;
    private int price;
    private String name;

    public Product() {

    }

    public Product(int iD, int price, String name) {
        this.iD = iD;
        this.price = price;
        this.name = name;
    }

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID = " + iD +
                ", Price = " + price +
                ", Name = '" + name + '\'' +
                '}';
    }
}
