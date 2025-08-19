package ss12_tree_map.bai_tap.arraylist;

import java.util.Comparator;

public class SortIncrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
