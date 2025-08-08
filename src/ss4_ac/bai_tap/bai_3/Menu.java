package ss4_ac.bai_tap.bai_3;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    final static int DISPLAY = 1;
    final static int ADD = 2;
    final static int UPDATE = 3;
    final static int DELETE = 4;
    final static int SEARCH = 5;

    public void display() {
        boolean flag = true;
        while (flag) {
            System.out.println("-----Quản lý sản phẩm-----\n 1. Hiển thị danh sách\n 2. Thêm sản phầm\n 3. Cập nhật sản phẩm\n 4. Xóa sản phẩm\n 5. Tìm kiếm sản phẩm");
            Scanner sc = new Scanner(System.in);
            int option = Integer.parseInt(sc.nextLine());
            ProductManager pm = new ProductManager();

            switch (option) {
                case DISPLAY:
                    System.out.println("Đây là chức năng hiển thị danh sách sản phẩm");
                    Product[] list = pm.getAll();
                    for (Product product : list) {
                        System.out.println(product);
                    }
                    break;
                case ADD:
                    System.out.println("Đây là chức năng thêm sản phẩṃ");
                    System.out.println("Nhập id sản phẩm");
                    int iD = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên sản phẩm");
                    String name = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm");
                    int price = Integer.parseInt(sc.nextLine());
                    pm.add(new Product(iD, price, name));
                    for (int i = 0; i < pm.getAll().length; i++) {
                        System.out.println(pm.getAll()[i]);
                    }
                    break;

                case UPDATE:
                    System.out.println("Đây là chức năng sửa sản phẩṃ");
                    pm.update();
                    for (int i = 0; i < pm.getAll().length; i++) {
                        System.out.println(pm.getAll()[i]);
                    }
                    break;

                case SEARCH:
                    System.out.println("Đây là chức năng tìm kiếm sản phẩṃ");
                    Product productSearch = pm.search();
                    if (productSearch == null) {
                        System.out.println("Sản phầm không tồn tại");
                    } else {
                        System.out.println(productSearch);
                    }
                    break;

                case DELETE:
                    System.out.println("Đây là chức năng xóa sản phẩm");
                    Product[] deleteList = pm.delete();
                    if (deleteList == null) {
                        System.out.println("Không tồn tại sản phẩm");
                    } else {
                        System.out.println("Xóa sản phẩm thành công");
                        for (Product product : deleteList) {
                            if (product != null) {
                                System.out.println(product);
                            }

                        }
                    }
                    break;

                default:
                    flag = false;
            }
        }

    }

}
