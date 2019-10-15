package lesson9.readyBox;

public class Utils {
    int a;
    public static int stringToInt(String s){
        return "".equals(s)?0:Integer.valueOf(s);
    }

    public int getA() {
        return a;
    }
}
