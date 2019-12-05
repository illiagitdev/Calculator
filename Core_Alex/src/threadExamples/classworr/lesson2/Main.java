package threadExamples.classworr.lesson2;
//todo: set(), compareAndSet()  перевірити як робитиме в багатопоточності
public class Main {
    public static void main(String[] args) {
        MyStack<Integer> intStack=new MyStack<>();
        intStack.push(23);
        intStack.push(324);
        intStack.push(3214);
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
    }
}
