package ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.repository;


import ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.entity.Product;

import java.util.Comparator;

public class SortDecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
