package ss12_tree_map.bai_tap.arraylist;

import java.util.Comparator;

public class Product{
    private int iD;
    private String name;
    private int price;

    public Product() {
    }

    public Product(int iD, String name, int price) {
        this.iD = iD;
        this.name = name;
        this.price = price;
    }

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID = " + iD +
                ", Name = " + name +
                ", Price = " + price +
                '}';
    }



}
