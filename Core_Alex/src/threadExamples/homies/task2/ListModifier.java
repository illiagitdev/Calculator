package threadExamples.homies.task2;

import java.util.List;

public class ListModifier<T> implements Runnable {
    private T message;
    private List<T> someList;

    public ListModifier(List<T> someList,T message) {
        this.someList=someList;
        this.message = message;
    }

    @Override
    public void run() {
        someList.add(message);
        someList.add(message);
        someList.add(message);
        System.out.printf("element: %s\n",someList.get(2));
        for (T value:someList             ) {
            someList.remove(1);
        }
        someList.remove(1);
        System.out.printf("hash: %s\n",message.hashCode());
    }
}
