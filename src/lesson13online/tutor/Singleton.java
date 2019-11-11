package lesson13online.tutor;

public final class Singleton implements Main.MyInterface {

    private static Singleton instance;

    public Singleton(String data) {
        this.data = data;
    }

    public String data;

    public void show(){
        System.out.println(this.getClass().getSimpleName());
    }


    public static Singleton getInstance(String data) {
        if (instance == null){
            instance = new Singleton(data);
        }
        return instance;
    }
}
