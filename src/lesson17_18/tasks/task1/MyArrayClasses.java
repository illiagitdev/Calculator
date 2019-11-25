package lesson17_18.tasks.task1;

import java.lang.reflect.Array;

public class MyArrayClasses<T> {
    private T[] array;
    private Class tClass;
    private int size=0;

    public MyArrayClasses(Class<T> tClass, int size) {
        this.tClass = tClass;
        array= (T[]) Array.newInstance(tClass,size);
    }

    public MyArrayClasses(Class<T> tClass) {
        this.tClass = tClass;
        array= (T[]) Array.newInstance(tClass,10);
    }

    public void add(T item){
        if(size==array.length){
            resize((int)(array.length*1.5+1));
        }
        array[size++]=item;
    }

    private void resize(int i) {
        T[] newArray=(T[])Array.newInstance(tClass,i);
        System.arraycopy(array,0,newArray,0,size);
        array=newArray;
    }

    public int size(){
        return size;
    }

    public void remove(int index){
        for (int i = index; i < size-1; i++) {
            array[i]=array[i+1];
        }
        array[--size]=null;
    }

    public T getIndex(int index){
        if(index<size) {
            return array[index];
        }
        return null;
    }
}
