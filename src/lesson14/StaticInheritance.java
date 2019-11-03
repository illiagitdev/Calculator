package lesson14;

public class StaticInheritance {
    public static void main(String[] args) {
    A a=new A();
    EN n;
    }

}
class A{
    static {
        System.out.println("Class A static block");
    }

    {
        System.out.println("Class A  block");
    }
}

enum EN{
    MOM("mon"),TUE("tue");

    private String id;
    EN(String id) {
        this.id=id;
    }
}