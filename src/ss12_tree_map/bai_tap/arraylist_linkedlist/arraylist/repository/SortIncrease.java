package ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.repository;

import ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.entity.Product;

import java.io.Serializable;
import java.util.Comparator;

public class SortIncrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
