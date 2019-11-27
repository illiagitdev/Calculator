package concurrency_cookbook;

import concurrency_cookbook.one.Calculator;

public class Main {
    public static void main(String[] trees){
        for (int i = 1; i <=10 ; i++) {
            Calculator calculator=new Calculator(i);
            Thread thread=new Thread(calculator);
            thread.start();
        }
    }
}
