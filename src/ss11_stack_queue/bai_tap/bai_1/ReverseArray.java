package ss11_stack_queue.bai_tap.bai_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập độ dài mảng");
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập độ dài mảng");
            int num = Integer.parseInt(sc.nextLine());
            stack.push(num);
        }

        System.out.println("Mảng trước khi đảo ngược");
        System.out.println(Arrays.toString(stack.toArray()));

        System.out.println("Mảng sau khi đảo ngược");
        for (int i = 0; !stack.empty(); i++) {
            System.out.print(stack.pop());
        }


    }
}
