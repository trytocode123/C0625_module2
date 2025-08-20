package ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.repository;

import ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    static List<Product> listProduct = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static {
        listProduct.add(new Product(1, "Asus", 12000000));
        listProduct.add(new Product(2, "Dell", 10000000));
        listProduct.add(new Product(3, "HP", 25000000));
        listProduct.add(new Product(4, "Lenovo", 30000000));
    }

    @Override
    public List<Product> findAll() {
        return listProduct;
    }

    @Override
    public boolean add(Product product) {
        listProduct.add(product);
        return true;
    }

    public int isValid(int iD) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getID() == iD) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean delete(int iD) {
        int i = isValid(iD);
        if (i != -1) {
            listProduct.remove(i);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(int i, Product product) {
        listProduct.set(i, product);
        return true;
    }

    public void sortIncrease() {
        listProduct.sort(new SortIncrease());
    }

    public void sortDecrease() {
        listProduct.sort(new SortDecrease());
    }
}
