import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        вводимо ціле число:                 123
        отримуємов таких представленнях
        двійкове                            111 1011
        восьмеричне                         173
        шістнадцятеричне                    7B
*/

        byte[] binaryArray = new byte[32];
        //char[] hexa = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D', 'E', 'F'};
        int numberD;
        String numberStr = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Decimal number: ");
        numberD = input.nextInt();

        //  binary
        int forBinary = numberD;
        while (forBinary > 0) {
            numberStr = forBinary % 2 + numberStr;
            forBinary /= 2;
        }

        System.out.print("\n" + "Binary number: " + numberStr + "\n");//toBinary(numberD));

        //  octal
        int forOctal = numberD;
        numberStr = "";
        while (forOctal > 0) {
            numberStr = forOctal % 8 + numberStr;
            forOctal /= 8;
        }
        System.out.print("Octal number: " + numberStr + "\n");//toOctal(numberD));

        //  hexa
        int forHexa = numberD;
        numberStr = "";
        while (forHexa > 0) {
            numberStr = forHexa % 16 + " " + numberStr;
            forHexa /= 16;
        }
        System.out.print("Hexadecimal number: " + numberStr);//toHexadecimal(numberD));
    }
}
