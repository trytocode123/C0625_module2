package ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.service;

import ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    boolean add(Product product);

    boolean delete(int iD);

    boolean update(int i, Product product);
}
