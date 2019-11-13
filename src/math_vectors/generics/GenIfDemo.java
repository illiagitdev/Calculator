package math_vectors.generics;

public class GenIfDemo {
    public static void main(String[] args) {
        Integer[] inums={3,5,4,2,5,2,3};
        Character[] chs={'w','c','t','q','m','a'};

        MyClass<Integer> iob=new MyClass<>(inums);
        MyClass<Character> cob=new MyClass<>(chs);

        System.out.println("Max value in inums: "+iob.max());
        System.out.println("Min value in inums: "+iob.min());
        System.out.println("Max value in chs: "+cob.max());
        System.out.println("Min value in chs: "+cob.min());
    }
}
