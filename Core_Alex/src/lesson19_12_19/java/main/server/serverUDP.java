package lesson19_12_19.java.main.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class serverUDP {
    private static final int PORT = 1641;

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(PORT);
        DatagramPacket packet = new DatagramPacket(new byte[1024], 124);
        socket.receive(packet);
        System.out.println(new String(packet.getData()));
        socket.close();
    }
}
