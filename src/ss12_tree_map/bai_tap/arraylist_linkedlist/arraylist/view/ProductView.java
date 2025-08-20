package ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.view;

import ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.entity.Product;

import java.util.Scanner;

public class ProductView {
    static Scanner sc = new Scanner(System.in);

    public static Product inputForProduct() {
        System.out.print("Enter id: ");
        int iD = Integer.parseInt(sc.nextLine());
        return inputForEditProduct(iD);
    }

    public static int inputID() {
        System.out.println("Enter the id: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static Product inputForEditProduct(int iD) {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        int price = Integer.parseInt(sc.nextLine());
        return new Product(iD, name, price);
    }
}
