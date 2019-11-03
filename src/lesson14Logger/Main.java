package lesson14Logger;

public class Main {
    {
        Logger.INSTANCE.log(LogType.WARNING,"init: warning");
    }


    static {
        Logger.INSTANCE.log(LogType.ERROR,"static init: error");
    }
    public static void main(String[] args) {
        Logger.INSTANCE.log(LogType.INFO,"Start Main");
    }
}
