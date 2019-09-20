package lesson5.hometask;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        /*
        Задание 1
            Написать функцию которая принимает на вход массив чисел и возвращает индекс максимального числа.
            Написать функцию которая принимает на вход массив чисел и возвращает максимальное число, используя первую функцию.
        Задание 2
            Написать рекурсивную функцию возведения числа-Х в степень-N
        Задание 3
            Задача на рекурсию.
Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно, в порядке возрастания
         */
        System.out.print("Task1: enter array size(int): ");
        int arrSize = getIntValue();
        int maxValIndex;
        int maxValue;
        int[] array = new int[arrSize];

        fillArray(array);
        showArray(array);
        maxValIndex = returnMaxElemIndex(array);
        System.out.println("\nIndex of Max value in array: " + maxValIndex);
        maxValue = returnMaxVal(array);
        System.out.println("Max value in array: " + maxValue);

        System.out.print("\nTask2: enter number(int): ");
        int x;
        int power;
        x = getIntValue();
        System.out.print("Enter power for this number: ");
        power = getIntValue();
        System.out.print("\nx^n = " + powerOfX(x, power));

        System.out.println("\nTask3: Enter two values.");
        int a;
        int b;
        System.out.print("Enter first number(int): ");
        a = getIntValue();
        System.out.print("\nEnter second number(int): ");
        b = getIntValue();
        showDown(a, b);
    }

    /**
     * Prints numbers from A to B
     *///todo: does't work correctly
    private static void showDown(int a, int b) {
        if (a < b) {
            System.out.println(a);
            showDown(a + 1, b);
        } else if (b < a) {
            System.out.println(a);
            showDown(a - 1, b);
        }
    }

    /**
     * Returnt VALUE to poverN
     */
    private static int powerOfX(int value, int power) {
        return value * (power == 0 ? 1 : powerOfX(value, power - 1));
    }

    /**
     * Returns MAX value in array
     */
    private static int returnMaxVal(int[] array) {
        return array[returnMaxElemIndex(array)];
    }

    /**
     * Returns index of MAX value from an array
     */
    private static int returnMaxElemIndex(int[] array) {
        int x = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (x < array[i]) {
                x = array[i];
                index = i;
            }
        }
        return index;
    }

    /**
     * Prints an array to console
     */
    private static void showArray(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    /**
     * Fills array with random integers
     */
    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
        }
    }

    /**
     * Returns int value
     */
    private static int getIntValue() {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            if (input.hasNextInt()) {
                flag = false;
            } else {
                System.out.print("Repeat input: ");
                input.next();
            }
        }
        return input.nextInt();
    }
}
