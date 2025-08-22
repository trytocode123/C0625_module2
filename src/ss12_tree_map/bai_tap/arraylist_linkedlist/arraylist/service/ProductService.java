package ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.service;

import ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.entity.Product;
import ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.repository.ProductRepository;


import java.io.Serializable;
import java.util.List;

public class ProductService implements IProductService {
    ProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public boolean add(Product product) {
        return productRepository.add(product);
    }

    @Override
    public boolean delete(int iD) {
        return productRepository.delete(iD);
    }

    @Override
    public boolean update(int i, Product product) {
        return productRepository.update(i, product);
    }

    public int isValid(int iD) {
        return productRepository.isValid(iD);
    }

    public void sortIncrease(List<Product> productList) {productRepository.sortIncrease(productList);
    }

    public void sortDecrease(List<Product> productList) {productRepository.sortDecrease(productList);
    }

}
