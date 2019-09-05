import java.util.Scanner;

public class ResultNumbers {
    public static void main(String[] args) {
        int numberD;
        Scanner input = new Scanner(System.in);

        System.out.print("Decimal number: ");
        numberD = input.nextInt();

        System.out.print("\n" + "Binary number: " + convertString(numberD,2) + "\n");

        System.out.print("Octal number: " + convertString(numberD,8) + "\n");

        System.out.print("Hexadecimal number: " + convertString(numberD, 16));
    }

    static char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static public int convertString(int value, int base){
        String result="";
        while (value > 0) {
            result = hexa[value % base] + result;
            value /= base;
        }
        return Integer.parseInt(result,base);
    }
}
