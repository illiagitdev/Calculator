package lesson13online.tutor;

public enum Singleton2 implements Main.MyInterface {
    INSTANCE("ZNACHENIE"), ROOT_INSTANCE("");

    public final String data;


    static {
        System.out.println("static block");
    }

    {
        System.out.println("block");
    }

    Singleton2(String data) {
        System.out.println("konstruktor");
        this.data = data;
    }

    public void show(){
        switch (this){
            case INSTANCE:
                System.out.println("usual");
                break;
            case ROOT_INSTANCE:
                System.out.println("root");
                break;
        }
    }





}
