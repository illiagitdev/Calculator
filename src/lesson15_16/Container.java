package lesson15_16;

public class Container<T extends Comparable<T>> {
   private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
