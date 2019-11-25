package lesson17_18.tasks.task2;

public class MyLinkedListClasses<T> {
    Node<T> item;

    private class Node<T> {
        T item;
        Node<T> next;

        public Node(T item) {
            this.item = item;
        }
    }

    public void add(T element) {
        if (item == null) {
            item = new Node<T>(element);
        } else {
            Node<T> last = item;
            while (item.next != null) {
                last = item.next;
            }
            last.next = new Node<T>(element);
        }
    }

    public int size() {
        int size = 0;
        if (item == null) {
            return 0;
        }
        Node<T> node = item;
        while (node.next != null) {
            node = node.next;
            size++;
        }
        return ++size;
    }

    public void remove(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> preNode = item;
        for (int i = 1; i < index - 1; i++) {
            preNode = preNode.next;
        }
        Node<T> current = preNode.next;
        Node<T> nextNode = current.next;
        preNode.next = nextNode;
    }

    public int getIndex(T element) {
        Node<T> last;
        int index = 0;
        last = item;
        do {
            if (last.item.equals(element)) {
                return index;
            }
            last = last.next;
            index++;
        } while (last != null);
        return -1;
    }

    public void clean(){
        item=null;
    }

    public T get(int index){
        if (index>=size()){
            throw new IndexOutOfBoundsException();
        }
        if (this.item==null){
            throw new NullPointerException();
        }
        Node<T> node=item;
        int currIndex=0;
        while (index!=currIndex){
            currIndex++;
            node=node.next;
        }
        return node.item;
    }
}
