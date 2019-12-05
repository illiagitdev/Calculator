package threadExamples.classworr.lesson2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

//todo: AtomicRefference
public class MyStack<T> {
    AtomicReference<Element> head = new AtomicReference<>(null);
    private int size=0;
    private AtomicInteger sizeAtom=new AtomicInteger(0);

    private class Element {
        T item;
        Element previous;

    }

    public void push(T element) {
        Element recent = head.get();

        Element current = new Element();
        current.item = element;
        current.previous = recent;

        head.set(current);
    }

    public T pop() {
        Element tmp = head.get();
        if (tmp == null) {
            return null;
        }
        Element result = tmp.previous;
        T value = tmp.item;
        head.set(result);
        return value;

    }
}
