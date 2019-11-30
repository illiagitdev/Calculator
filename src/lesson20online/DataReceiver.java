package lesson20online;

public interface DataReceiver<T> {
    public void onDataReceive(T data);
}
