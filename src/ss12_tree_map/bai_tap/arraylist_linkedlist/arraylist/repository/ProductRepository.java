package ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.repository;

import ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.entity.Product;
import ss8_mvc.bai_1.util.ReadFileAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {

    final static String pathFile = "src/ss12_tree_map/bai_tap/arraylist_linkedlist/arraylist/data/product.dat";


    @Override
    public List<Product> findAll() {
        List<Product> listProduct = new ArrayList<>();
        listProduct = ReadFileAndWriteFile.readBinaryFile(pathFile);
        return listProduct;
    }

    @Override
    public boolean add(Product product) {
        List<Product> listProduct = ReadFileAndWriteFile.readBinaryFile(pathFile);
        listProduct.add(product);
        ReadFileAndWriteFile.writeBinaryFile(pathFile, listProduct);
        return true;
    }

    public int isValid(int iD) {
        List<Product> listProduct = ReadFileAndWriteFile.readBinaryFile(pathFile);
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getID() == iD) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean delete(int iD) {
        List<Product> listProduct = ReadFileAndWriteFile.readBinaryFile(pathFile);
        int i = isValid(iD);
        if (i != -1) {
            listProduct.remove(i);
            ReadFileAndWriteFile.writeBinaryFile(pathFile, listProduct);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(int i, Product product) {
        List<Product> listProduct = ReadFileAndWriteFile.readBinaryFile(pathFile);
        listProduct.set(i, product);
        ReadFileAndWriteFile.writeBinaryFile(pathFile, listProduct);
        return true;
    }

    public void sortIncrease(List<Product> productList) {
        productList.sort(new SortIncrease());
    }

    public void sortDecrease(List<Product> productList) {
        productList.sort(new SortDecrease());
    }
}
