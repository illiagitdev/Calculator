package threadExamples.homies.task4;

public class Services {
    private Counter counter;

    public Services() {
        initialize();
    }

    public void run(){
        counter.run();
    }

    private void initialize() {
        counter = new Counter();
    }
}
