package ss4_ac.bai_tap.bai_3;

import java.util.Scanner;

public class Menu {
    final static int DISPLAY = 1;
    final static int ADD = 2;
    final static int UPDATE = 3;
    final static int DELETE = 4;
    final static int SEARCH = 5;
    final static int EXIT = 6;

    public void display() {
        boolean flag = true;
        while (flag) {
            System.out.println("-----Quản lý sản phẩm-----\n 1. Hiển thị danh sách\n 2. Thêm sản phầm\n 3. Cập nhật sản phẩm\n 4. Xóa sản phẩm\n 5. Tìm kiếm sản phẩm\n 6. Thoát");
            Scanner sc = new Scanner(System.in);
            int option = Integer.parseInt(sc.nextLine());
            ProductManager pm = new ProductManager();

            switch (option) {
                case DISPLAY:
                    Product[] list = pm.getAll();
                    System.out.println("Đây là chức năng hiển thị danh sách sản phẩm");
                    for (Product product : list) {
                        System.out.println(product);
                    }
                    break;
                case ADD:
                    System.out.println("Đây là chức năng thêm sản phẩṃ");
                    pm.add();
                    break;

                case UPDATE:
                    System.out.println("Đây là chức năng sửa sản phẩṃ");
                    pm.update();
                    break;

                case SEARCH:
                    System.out.println("Đây là chức năng tìm kiếm sản phẩṃ");
                    pm.search();
                    break;

                case DELETE:
                    System.out.println("Đây là chức năng xóa sản phẩm");
                    pm.delete();
                    break;

                case EXIT:
                    flag = false;
            }
        }

    }
}
