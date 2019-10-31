package lesson13online.singletone;

public final class Singletone implements MyInterface {
    private static Singletone instance;

    public String date="My data";

    public Singletone(String date) {
        this.date = date;
    }

    public void show(){
        System.out.println(this.getClass().getSimpleName());
    }

    public static Singletone getInstance(String data) {
        if (instance==null){
            instance=new Singletone(data);
        }
        return instance;
    }
}
