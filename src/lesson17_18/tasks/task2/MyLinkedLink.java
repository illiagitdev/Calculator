package lesson17_18.tasks.task2;

public class MyLinkedLink<T> {
    private int size;

    private Node item;

    private class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void add(T value) {
        if (item == null) {
            item = new Node(value);
            size++;
        } else {
            Node<T> preNode = item;
            do {
                preNode = preNode.next;
            } while (item.next != null);

            preNode.next=new Node<>(value);
            size++;
        }
    }

    public int size(){
        int size=0;
        while (item.next!=null){
            size++;
        }
        return ++size;
    }

    public void remove(int index){
        if(index>=size()){
            throw new IndexOutOfBoundsException();
        }
            Node<T> preNode = item;
            for (int i = 1; i < index-1; i++) {
                preNode=preNode.next;
            }
            Node<T> current=preNode.next;
            Node<T> nextNode=current.next;
            preNode.next=nextNode==null?null:nextNode;
    }

    public int getIndex(T element){
        Node<T> preNode = item;
        int index=0;
        do {
            preNode = preNode.next;
            index++;
            if (preNode.equals(element)){
                return index;
            }
        } while (item.next != null);
        return -1;
    }

    public void remove(){
        item=null;
    }

    public T get(int index){
        if(index>=size()){
            throw new IndexOutOfBoundsException();
        }
        if(this.item==null){
            throw new NullPointerException();
        }
        Node<T> node=item;
        int currInd=0;

        while (index!=currInd) {
            currInd++;
            node=node.next;
        }
                return node.data;
    }

    @Override
    public String toString() {
        String res = "";
//        while (head.next != null)
//            res = head.next.toString();
        return "MyLinkedLink{" +
                "head=" + item.data + item.next.toString() +
                '}';
    }

    /*
    * Задание 2 - LinkedList
Написать свой класс MyLinkedList как аналог классу LinkedList.

Нельзя использовать массив. Каждый элемент должен быть отдельным объектом-посредником(Node - нода) который хранит ссылку на прошлый и следующий элемент коллекции(двусвязный список).

Методы
add(T value) добавляет элемент в конец

remove(int index) удаляет элемент под индексом

clear() очищает коллекцию

size() возвращает размер коллекции

get(int index) возвращает элемент под индексом*/


}
