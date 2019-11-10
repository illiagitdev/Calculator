package lesson15_16;

public class SomeClass<T> implements Inter<SomeClass<T>> {
    @Override
    public SomeClass create() {
        return new SomeClass();
    }
}
