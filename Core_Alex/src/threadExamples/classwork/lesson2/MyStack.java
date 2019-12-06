package threadExamples.classworr.lesson2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

//todo: AtomicRefference
public class MyStack<T> {
    AtomicReference<Element> head = new AtomicReference<>(null);
    private int size = 0;
    private AtomicInteger sizeAtom = new AtomicInteger(0);

    private class Element {
        T item;
        Element previous;
    }

    public void push(T element) {
        Element recent = head.get();

        Element current = new Element();
        current.item = element;
        current.previous = recent;
        System.out.printf("%s: incerted value %d\n", Thread.currentThread().getName(), element);
        head.set(current);
    }

    public T pop() {
        Element tmp = head.get();
        if (tmp == null) {
            return null;
        }
        Element result = tmp.previous;
        T value = tmp.item;
        System.out.printf("%s: deleted value %d\n", Thread.currentThread().getName(), value);
        head.set(result);
        return value;
    }

    @Override
    public String toString() {
        Element tmp = head.get();
        String result="";
        if (tmp != null) {
            while (tmp.previous != null) {
                result += tmp.toString()+"  ";
                tmp=tmp.previous;
            }
        }
        return result;
    }
}
