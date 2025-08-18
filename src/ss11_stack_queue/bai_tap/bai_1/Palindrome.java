package ss11_stack_queue.bai_tap.bai_1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Stack<Character> stackString = new Stack<>();
        Queue<Character> queueString = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi để kiểm tra Palindome:");
        String str = sc.nextLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            stackString.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            queueString.add(str.charAt(i));
        }

        boolean flag = true;

        while (!stackString.empty()) {
            if (!stackString.pop().equals(queueString.poll())) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Chuỗi vừa nhập là Palindrome" : "Chuỗi vừa nhập không phải Palindrome");
    }
}
