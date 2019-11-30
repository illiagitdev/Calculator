package lesson20online;

public class Main2 {
    public static int i=0;

    public static void main(String[] args) {
        Main main=new Main();
        Generator generator=new Generator(new DataReceiver<String>() {
            @Override
            public void onDataReceive(String data) {
                main.show(data);
            }
        });
        generator.start();
    }

    public void show(String data){
        System.out.println(++i+" Receive data: " +data);
    }
}
