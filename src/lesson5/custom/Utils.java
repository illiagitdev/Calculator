package lesson5.custom;

public class Utils {
    public void showPublic() {
        System.out.print("Public");
        showPrivate();
    }

    private void showPrivate() {
        System.out.print("Private");
    }

    void show() {// default - in this package only(any class in this package)
        System.out.print("show");
    }
}
