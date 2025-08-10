package ss4_ac.bai_tap.bai_3;

import java.util.Scanner;

public class ProductManager {
    private final static Product[] productList = new Product[100];

    static {
        Product product1 = new Product(1, 22_000_000, "Iphone");
        Product product2 = new Product(2, 20_000_000, "Samsung");
        productList[0] = product1;
        productList[1] = product2;
    }

    public Product[] getAll() {
        int count = 0;
        for (Product product : productList) {
            if (product != null) {
                count++;
            } else {
                break;
            }
        }

        Product[] products = new Product[count];

        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null) {
                products[i] = productList[i];
            } else {
                break;
            }
        }

        return products;
    }

    public void add() {
        System.out.println("Nhập id sản phẩm");
        Scanner sc = new Scanner(System.in);
        int iD = Integer.parseInt(sc.nextLine());
        boolean flagAdd = false;
        for (Product item : productList) {
            if (item != null && item.getID() == iD) {
                System.out.println("Sản phẩm đã tồn tại");
                flagAdd = true;
                break;
            }
        }
        boolean flagIsFull = false;
        if (!flagAdd) {
            System.out.println("Nhập tên sản phẩm");
            String name = sc.nextLine();
            System.out.println("Nhập giá sản phẩm");
            int price = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < productList.length; i++) {
                if (productList[i] == null) {
                    productList[i] = new Product(iD, price, name);
                    System.out.println("Đã thêm thành công");
                    flagIsFull = true;
                    break;
                }
            }
            if (!flagIsFull) {
                System.out.println("Danh sách đã đầy, không thể thêm");
            }
        }
        Product[] list = this.getAll();

        for (Product item : list) {
            System.out.println(item);
        }

    }

    private int positionItemAvailable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm xem sản phẩm có tồn tại hay không");
        int iD = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getID() == iD) {
                return i;
            }
        }
        return -1;
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        int index = this.positionItemAvailable();
        if (index != -1) {
            System.out.println("Nhập id sản phẩm để câp nhật");
            int iD = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập tên sản phẩm");
            String name = sc.nextLine();
            System.out.println("Nhập giá sản phẩm");
            int price = Integer.parseInt(sc.nextLine());
            productList[index] = new Product(iD, price, name);
            System.out.println("Cập nhật thành công");
        } else {
            System.out.println("Không tồn tại sản phẩm");
        }

        Product[] list = this.getAll();
        for (Product i : list) {
            System.out.println(i);
        }

    }

    public void search() {
        int positionItem = positionItemAvailable();
        if (positionItem != -1) {
            System.out.println(productList[positionItem]);
        } else {
            System.out.println("Sản phẩm không được tìm thấy");
        }
    }

    public void delete() {
        int position = positionItemAvailable();
        if (position != -1) {
            Product[] newList;

            for (int j = position; j < productList.length - 1; j++) {
                productList[j] = productList[j + 1];
            }
            newList = this.getAll();
            if (newList.length > 1 && newList[newList.length - 1] == newList[newList.length - 2]) {
                newList[newList.length - 1] = null;
            }

            System.out.println("Xóa sản phẩm thành công");
            for (Product product : newList) {
                System.out.println(product);
            }

        } else {
            System.out.println("Không tồn tại sản phẩm");
        }
    }
}
