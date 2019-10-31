package lesson13online.singletone;

public class Main {
    public static void main(String[] args) {
        System.out.println(Singletone.getInstance("gg").date);

        Singletone ex1 = Singletone.getInstance("rtdh");
        Singletone ex2 = Singletone.getInstance("ct");
        ex1.date="wadqa";

        System.out.println(SingletoneEnum.SINGLETONEENUM.data);
    }
}
