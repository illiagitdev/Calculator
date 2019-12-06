package threadExamples.classwork.lesson2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

//todo: AtomicRefference
public class MyStack<T> {
    private AtomicReference<Element> head = new AtomicReference<>(null);
    private AtomicInteger sizeAtom = new AtomicInteger(0);

    private class Element {
        volatile T item;
        Element previous;
    }

    public synchronized void push(T element) {
        Element recent = head.get();
        int val=sizeAtom.get();
        Element current = new Element();
        current.item = element;
        current.previous = recent;
        head.set(current);
        sizeAtom.compareAndSet(val, val+1);
        System.out.printf("%s: incerted value %s , \tsize- %s\n", Thread.currentThread().getName(), element, sizeAtom.get());
    }

    public T pop() {
        Element tmp = head.get();
        int val=sizeAtom.get();
        if (tmp == null) {
            return null;
        }
        Element result = tmp.previous;
        T value = tmp.item;
        head.set(result);
        if (val>=0) {
            sizeAtom.compareAndSet(val, val-1);
        }
        System.out.printf("%s: deleted value %s , \tsize- %s\n", Thread.currentThread().getName(), value, sizeAtom.get());
        return value;
    }

    public int size(){
        return sizeAtom.get();
    }

    @Override
    public String toString() {
        Element tmp = head.get();
        String result="RESULT: ";
        if (tmp != null) {
            while (tmp.previous != null) {
                result += tmp.item.toString()+"  ";
                tmp=tmp.previous;
            }
        }
        return result+"  size: "+sizeAtom.get();
    }
}
