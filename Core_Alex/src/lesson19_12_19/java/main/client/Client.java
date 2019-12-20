package lesson19_12_19.java.main.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final int PORT = 1641;
    private static final String HOST = "127.0.0.1";

    public static void main(String[] args) throws IOException {
        try(Socket socket = new Socket(HOST, PORT)) {
            System.out.println("Connected to " + socket.getRemoteSocketAddress());
            // відправляємо данні на сервер
            DataOutputStream os = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
//            while (scanner.hasNext()){
//                os.writeUTF(scanner.nextLine());
//            }
            os.writeUTF("Hello from a client!");
            Thread.sleep(10000);
            //пакети з сервера
            DataInputStream is = new DataInputStream(socket.getInputStream());
            System.out.println("Get from the server = " + is.readUTF());

            System.out.println("Closing the connection!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
