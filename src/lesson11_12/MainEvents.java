package lesson11_12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainEvents {
    public static void main(String[] args) {
        Switcher switcher=new Switcher();

        switcher.addElectricityConsumer(new Lamp());
        switcher.addElectricityConsumer(new Plasma());
        switcher.addElectricityConsumer(new Tolik());

        //event
        switcher.addElectricityConsumer(new ElectricityConsumer() {
            @Override
            public void electricityOn() {
                System.out.println("short circuit");
            }

            @Override
            public void electricityOff() {

            }

            @Override
            public String getTitle() {
                return null;
            }
        });

        new Lamp().power=5;
        Lamp lamp=new Lamp();
        Lamp.Filamen filamen=lamp.new Filamen();
        Lamp.Filamen filamen1=new Lamp().new Filamen();


        switcher.electricityEnabled();

        try {
            System.out.println(Lamp.class.getDeclaredField("filamen").getType().getSimpleName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        try {
            Method method = Lamp.class.getDeclaredMethod("doSomething");
            method.invoke("lol");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        for (ElectricityConsumer con:switcher.getConsumers()
             ) {
            System.out.println(con.getTitle());
        }
    }
}
