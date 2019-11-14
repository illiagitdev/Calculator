package lesson15_16;

public class NonGen {
    int num;

    public NonGen(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

class Gen4<T> extends NonGen{
    T ob;

    public Gen4( T ob, int num) {
        super(num);
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

class HierDemo2{
    public static void main(String[] args) {
        Gen4<String> strOb=new Gen4<>("Hello ",35);

        System.out.print(strOb.getOb());
        System.out.println(strOb.getNum());
    }
}
