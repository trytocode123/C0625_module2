package ss11_stack_queue.bai_tap.bai_1;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        System.out.print("Nhập số để chuyển đổi hệ nhị phân: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }

        System.out.print("Chuỗi nhị phân: ");

        for (int i = 0; !stack.empty(); i++) {
            System.out.print(stack.pop());
        }
    }
}
