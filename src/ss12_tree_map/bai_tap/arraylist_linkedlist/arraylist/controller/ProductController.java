package ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.controller;

import ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.entity.Product;
import ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.repository.ProductRepository;
import ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.repository.SortDecrease;
import ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.repository.SortIncrease;
import ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.service.ProductService;
import ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.view.ProductView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    static Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        final int ADD = 1;
        final int UPDATE = 2;
        final int DELETE = 3;
        final int DISPLAY = 4;
        final int FIND = 5;
        final int SORT_INCREASE = 6;
        final int SORT_DECREASE = 7;

        boolean flag = true;
        ProductService productService = new ProductService();
        List<Product> productList = productService.findAll();
        int option;
        while (flag) {
            System.out.println("1. Add\n2. Update\n3. Delete\n4. Display\n5. Find\n6. Sort Increase\n7. Sort Decrease\n8. Exit");
            System.out.print("Enter the number function: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case ADD:
                    Product product = ProductView.inputForProduct();
                    productService.add(product);
                    System.out.println("Add success");
                    break;

                case UPDATE:
                    System.out.println("This is update product function");

                    int indexUpdate = productService.isValid(ProductView.inputID());
                    if (indexUpdate != -1) {
                        productService.update(indexUpdate, ProductView.inputForEditProduct(productList.get(indexUpdate).getID()));
                        System.out.println("Update success");
                    } else {
                        System.out.println("Not found to update");
                    }
                    break;

                case DELETE:
                    System.out.println("This is delete product function");
                    boolean resultDel = productService.delete(ProductView.inputID());
                    if (resultDel) {
                        System.out.println("Delete success");
                    } else {
                        System.out.println("Not found to delete");
                    }
                    break;

                case DISPLAY:
                    System.out.println("This is list of product");
                    for (Product productDisplay : productService.findAll()) {
                        System.out.println(productDisplay);
                    }
                    break;

                case FIND:
                    System.out.println("This is find product function");
                    int indexFind = productService.isValid(ProductView.inputID());
                    if (indexFind != -1) {
                        System.out.println(productList.get(indexFind));
                    } else {
                        System.out.println("Not found");
                    }
                    break;

                case SORT_INCREASE:
                    System.out.println("This is sort increase by price");
                    List<Product> listInc = productService.sortIncrease();
                    for (Product product1 : listInc) {
                        System.out.println(product1);
                    }
                    break;

                case SORT_DECREASE:
                    System.out.println("This is sort decrease by price");
                    productService.sortDecrease();
                    List<Product> listDec = productService.sortDecrease();
                    for (Product product2 : listDec) {
                        System.out.println(product2);
                    }
                    break;

                default:
                    flag = false;
            }
        }
    }
}
