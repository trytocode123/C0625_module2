package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class Bai3 {

    public static int input() {
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập chữ số: ");
            number = Integer.parseInt(sc.nextLine());
        } while (number < 0);
        return number;
    }

    public static String numberLower10(int input) {
        String str = "";
        switch (input) {
            case 0:
                str = "zero";
                break;
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
            default:
        }
        return str;
    }

    public static String numberHigherOrEqual10(int input) {
        int ones = input % 10;
        String str = "";
        switch (ones) {
            case 0:
                str = "ten";
                break;
            case 1:
                str = "eleven";
                break;
            case 2:
                str = "twelve";
                break;
            case 3:
                str = "thirteen";
                break;
            case 4:
                str = "fourteen";
                break;
            case 5:
                str = "fifteen";
                break;
            case 6:
                str = "sixteen";
                break;
            case 7:
                str = "seventeen";
                break;
            case 8:
                str = "eighteen";
                break;
            case 9:
                str = "nineteen";
                break;
            default:
        }
        return str;
    }

    public static String numberHigher20(int input) {
        int ones = input % 10;
        int tens = input / 10;
        String str = "";
        switch (tens) {
            case 2:
                str += "twenty ";
                break;
            case 3:
                str += "thirty ";
                break;
            case 4:
                str += "forty ";
                break;
            case 5:
                str += "fifty ";
                break;
            case 6:
                str += "sixty ";
                break;
            case 7:
                str += "seventy ";
                break;
            case 8:
                str += "eighty ";
                break;
            case 9:
                str += "ninety ";
                break;
            default:
        }

        switch (ones) {
            case 1:
                str += "one";
                break;
            case 2:
                str += "two";
                break;
            case 3:
                str += "three";
                break;
            case 4:
                str += "four";
                break;
            case 5:
                str += "five";
                break;
            case 6:
                str += "six";
                break;
            case 7:
                str += "seven";
                break;
            case 8:
                str += "eight";
                break;
            case 9:
                str += "nine";
                break;
            default:
        }
        return str;
    }

    public static String numberHigher100(int input) {
        int hundreds = input / 100;
        int tens = input % 100;

        String str = "";
        switch (hundreds) {
            case 1:
                str += "one hundred";
                break;
            case 2:
                str += "two hundred";
                break;
            case 3:
                str += "three hundred";
                break;
            case 4:
                str += "four hundred";
                break;
            case 5:
                str += "five hundred";
                break;
            case 6:
                str += "six hundred";
                break;
            case 7:
                str += "seven hundred";
                break;
            case 8:
                str += "eight hundred";
                break;
            case 9:
                str += "nine hundred";
                break;
        }

        if ((input % 100) == 0) {
            str += "";
        } else if (tens < 10 && tens > 0) {
            str = str + " and " + numberLower10(tens);
        } else if (tens < 20) {
            str = str + " and " + numberHigherOrEqual10(tens);
        } else if (tens > 20) {
            str += " and " + numberHigher20(tens);
        } else {
            str += numberHigherOrEqual10(tens);
        }
        return str;

    }

    public static void main(String[] args) {
        int input = input();
        if (input < 10) {
            System.out.print(numberLower10(input));
        } else if (input < 20) {
            System.out.println(numberHigherOrEqual10(input));
        } else if (input < 100) {
            System.out.println(numberHigher20(input));
        } else if (input < 1000) {
            System.out.println(numberHigher100(input));
        } else {
            System.out.println("Out of ability");
        }
    }
}
