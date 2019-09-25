package lesson6;

import java.util.Scanner;

public class PracticeExemples {

    public static void main(String[] args) {
        int length;
        System.out.print("creating array with random integer values\ndefine array length: ");
        length=scanInt();
        int[] array=new int[length];
        fillArrayInt(array);
        showArray(array);

        /**
         * Масиви - метод повертає середнє арифметичне
         */
        arrayMean(array);

        /**
         * Масиви - метод повертає медіану
         */
//        arrayMedian(array);

        /**
         * приведення до степені через логарифм та експоненту
         */
        powLnExp();

        /**
         * реверс символів у рядку
         */
//        SwapString(line);
    }

    private static void powLnExp() {
        System.out.print("enter value: ");
        int x=scanInt();
        System.out.print("\nenter power ");
        int n=scanInt();
        int result= (int) Math.ceil(Math.exp(n*Math.log(x)));
        System.out.println("Math.pow(x,n) "+Math.pow(x,n));
        System.out.println("(int) Math.exp(n*Math.log(x) "+result);
        System.out.println("Math.exp(n*Math.log(x) "+Math.exp(n*Math.log(x)));
    }

    private static void arrayMean(int[] array) {
        int sum=0;
        for (int x:array             ) {
            sum+=x;
        }
        System.out.println("\nmath average is "+(sum/array.length));
    }

    private static void showArray(int[] array) {
        for (int x:array             ) {
            System.out.print(x+" ");
        }
    }

    private static void fillArrayInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]= (int) (Math.random()*100-50);
        }
    }

    private static int scanInt() {
        return new Scanner(System.in).nextInt();
    }
}
