package ss12_tree_map.bai_tap.arraylist_linkedlist.linkedlist;

import java.util.Comparator;

public class SortDecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
