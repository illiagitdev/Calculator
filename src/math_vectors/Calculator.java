package math_vectors;

import java.util.Scanner;

public class Calculator {
    static final char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};


    public static void main(String[] args) {
        int numberD;
        Scanner input = new Scanner(System.in);

        System.out.print("Decimal number: ");
        numberD = input.nextInt();

        System.out.println("\n" + "Binary number: " + convertString(numberD, 2));

        System.out.println("Octal number: " + convertString(numberD, 8));

        System.out.println("Hexadecimal number: " + convertString(numberD, 16));

    }


    static public String convertString(int value, int base) {
        String result = "";
        while (value > 0) {
            result = hexa[value % base] + result;
            value /= base;
        }
        if (base == 2) {
            result = "0b" + result;
        } else if (base == 8) {
            result = "0" + result;
        } else if (base == 16) {
            result = "0x" + result;
        }
        return result;
    }
}
