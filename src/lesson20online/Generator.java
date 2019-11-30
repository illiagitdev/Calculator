package lesson20online;

import java.util.Timer;
import java.util.TimerTask;

public class Generator {

    private DataReceiver<String> dataReceiver;
    private Timer timer;

    public Generator(DataReceiver<String> dataReceiver) {
        this.dataReceiver = dataReceiver;
        timer = new Timer();
    }

    public void start(){
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                dataReceiver.onDataReceive("new data");
            }
        }, 0, 5000);
    }
}
