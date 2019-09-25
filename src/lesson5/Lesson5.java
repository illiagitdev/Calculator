package lesson5;

import lesson5.custom.*;

public class Lesson5 {
    public static void main(String[] args) {
//        int i = 5;//примітив
//
//        Long i1 = 128l;
//        Long i2 = 128l;
//
//        System.out.println(i1 == i2);// в межах байту йде анбоксінг і порівняння чисел, за межами байта порівнюються адреси посилань
//        System.out.println(i1.equals(i2));
//        System.out.println(i1.hashCode());
//        System.out.println(i2.hashCode());
//        Lesson5.add(3,7);
//
//
//        Utils utils=new Utils();
//        utils.showPublic();
        int n = 7, res = n;

        while (n > 1) {
            res *= (n - 1);
            n--;
        }
        System.out.println("n! " + res);

        n = 7;
        System.out.println("factorial(n) " + factorial(n));

        System.out.println("factorialIf(n) " + factorialIf(n));

    }

    static int factorial(int value) {
        return (value == 0) ? 1 : value*factorial(value - 1);
    }

    static int factorialIf(int value) {
        if(value==0){
            return 1;
        }else
            return value*factorialIf(value-1);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }
}
