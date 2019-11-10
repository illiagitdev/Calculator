package lesson15_16;

public interface Inter<T extends Inter<T>>{
    T create();
}
