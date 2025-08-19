package ss12_tree_map.bai_tap.linkedlist;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static int isValidById(List<Product> list) {
        System.out.print("Enter id:");
        int iD = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == iD) {
                return i;
            }
        }
        return -1;
    }

    public static Product isValidByName(List<Product> list) {
        System.out.print("Enter name:");
        String name = sc.nextLine();
        for (Product product : list) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public static void mainMenu() {
        List<Product> listProduct = new LinkedList<>();

        final int ADD = 1;
        final int UPDATE = 2;
        final int DELETE = 3;
        final int DISPLAY = 4;
        final int FIND = 5;
        final int SORT_INCREASE = 6;
        final int SORT_DECREASE = 7;
        listProduct.add(new Product(1, "Asus", 21000000));
        listProduct.add(new Product(2, "Dell", 20000000));
        listProduct.add(new Product(3, "HP", 25000000));
        listProduct.add(new Product(4, "Lenovo", 30000000));

        boolean flag = true;

        int option;
        while (flag) {
            System.out.println("1. Add\n2. Update\n3. Delete\n4. Display\n5. Find\n6. Sort Increase\n7. Sort Decrease\n8. Exit");
            System.out.print("Enter the number function: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case ADD:
                    System.out.println("This is add product function");
                    System.out.print("Enter id: ");
                    int iD = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter price");
                    int price = Integer.parseInt(sc.nextLine());
                    listProduct.add(new Product(iD, name, price));
                    System.out.println("Add success");
                    break;

                case UPDATE:
                    System.out.println("This is update product function");
                    int iUpdate = isValidById(listProduct);
                    if (iUpdate != -1) {
                        System.out.print("Enter name: ");
                        String nameUpdate = sc.nextLine();
                        System.out.println("Enter price");
                        int priceUpdate = Integer.parseInt(sc.nextLine());
                        listProduct.set(iUpdate, new Product(iUpdate, nameUpdate, priceUpdate));
                        System.out.println("Update success");
                    } else {
                        System.out.println("Not found to update");
                    }
                    break;
                case DELETE:
                    System.out.println("This is delete product function");
                    int iDel = isValidById(listProduct);
                    if (iDel != -1) {
                        listProduct.remove(iDel);
                        System.out.println("Delete success");
                    } else {
                        System.out.println("Not found to delete");
                    }

                    break;
                case DISPLAY:
                    System.out.println("This is list of product");
                    for (Product product : listProduct) {
                        System.out.println(product);
                    }
                    break;
                case FIND:
                    System.out.println("This is find product function");
                    Product product = isValidByName(listProduct);
                    if (product != null) {
                        System.out.println(product);
                    } else {
                        System.out.println("Not found");
                    }
                    break;
                case SORT_INCREASE:
                    System.out.println("This is sort increase by price");
                    listProduct.sort(new SortIncrease());
                    for (Product productIn : listProduct) {
                        System.out.println(productIn);
                    }
                    break;

                case SORT_DECREASE:
                    System.out.println("This is sort decrease by price");
                    listProduct.sort(new SortDecrease());
                    for (Product productDe : listProduct) {
                        System.out.println(productDe);
                    }
                    break;
                default:
                    flag = false;
            }
        }
    }
}
