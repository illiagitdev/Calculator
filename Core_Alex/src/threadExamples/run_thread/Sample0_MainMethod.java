package threadExamples.run_thread;


import static threadExamples.Utils.print;

public class Sample0_MainMethod {

    public static void main(String[] args) throws InterruptedException {
        print("Начали!");

        Thread.currentThread().join();

        print("закончили!");
    }

}
