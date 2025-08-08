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

    public void add(Product product) {
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] == null) {
                productList[i] = product;
                System.out.println("Đã thêm thành công");
                break;
            } else {
                System.out.println("Danh sách đã đầy, không thể thêm");
            }
        }
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm");
        int iD = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getID() == iD) {
                System.out.println("Nhập id sản phẩm");
                iD = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập tên sản phẩm");
                String name = sc.nextLine();
                System.out.println("Nhập giá sản phẩm");
                int price = Integer.parseInt(sc.nextLine());
                productList[i] = new Product(iD, price, name);
                System.out.println("Cập nhật thành công");
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Không tồn tại sản phẩm");
        }
    }

    public Product search() {
        System.out.println("Nhập id để tìm kiếm sản phẩm");
        Scanner sc = new Scanner(System.in);
        int iD = Integer.parseInt(sc.nextLine());
        for (Product product : productList) {
            if (product != null && product.getID() == iD) {
                return product;

            }
        }
        return null;
    }

    public Product[] delete() {
        Product[] newList;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id cần xóa");
        int iD = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getID() == iD) {
                for (int j = i; j < productList.length - 1; j++) {
                    productList[j] = productList[j + 1];
                }
                newList = this.getAll();
                if (newList.length > 1 && newList[newList.length - 1] == newList[newList.length - 2]) {
                    newList[newList.length - 1] = null;
                }
                return newList;
            }
        }
        return null;
    }
}
