package ss2_mang.bai_tap;

public class Bai5 {

    public static int findMin(int [] array) {
        int min = array[0];
        for (int j : array) {
            if (j <= min) {
                min = j;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] input = Input.input();
        System.out.println("Min is " + findMin(input));
    }
}
