package lesson17_18.tasks.task1;

import java.lang.reflect.Array;
import java.util.*;

public class MyArrayList<T> implements List<T> {
    private T[] list;
    private static int sizeL = 0;
private Class tClass;

    public MyArrayList(Class<T> tClass, int size) {
        this.tClass=tClass;
        list =(T[]) Array.newInstance(tClass, size);
    }

    public MyArrayList(Class<T> tClass) {
        this.tClass=tClass;
        list =(T[]) Array.newInstance(tClass, 10);
    }

    @Override
    public boolean add(T t) {
        if (sizeL == list.length) {
            resize();
        }
            list[sizeL++] = t;
            return true;
    }

    private void resize(){
        T[] zlist =(T[]) Array.newInstance(tClass, (int) (sizeL*1.5+1));
        System.arraycopy(list, 0, list, 0, sizeL - 1);
    }

    @Override
    public T remove(int index) {
        T removed = list[index];
        T[] nelList;
        System.arraycopy(list, index, list, index - 1, sizeL - index - 1);
        list[sizeL--] = null;
        return removed;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return list[index];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }


}
