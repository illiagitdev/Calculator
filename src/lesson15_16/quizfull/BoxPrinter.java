package lesson15_16.quizfull;

public class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T arg) {
        val = arg;
    }

    @Override
    public String toString() {
        return "{" + val + '}';
    }

    public T getVal() {
        return val;
    }
}

class Test{
    public static void main(String[] args) {
        BoxPrinter<Integer> value1 =new BoxPrinter<>(new Integer(12));
        System.out.println(value1);
        Integer intValue = value1.getVal();
        BoxPrinter<String> value2 =new BoxPrinter<>("Hello world!!!");
        System.out.println(value2);

//        Integer intValue2 = value2.getVal();

    }
}