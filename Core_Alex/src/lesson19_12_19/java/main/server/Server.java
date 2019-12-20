package lesson19_12_19.java.main.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static final int PORT = 1641;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.execute(() -> {
            try (ServerSocket server = new ServerSocket(PORT)) {
                while (true) {
                    System.out.println("Waiting for the client!");
                    try (Socket socket = server.accept()) {
                        //отримуємо пакети від клієнта
                        DataInputStream is = new DataInputStream(socket.getInputStream());
                        System.out.println("Message from the client = " + is.readUTF());
                        //відправляємо пакети клієнту
                        DataOutputStream os = new DataOutputStream(socket.getOutputStream());
                        os.writeUTF("Bye my dear");
                    }
                }
            } catch (IOException e) {
                System.out.println("Some exception has occured " + e.getMessage());
            }
        });
    }
}
