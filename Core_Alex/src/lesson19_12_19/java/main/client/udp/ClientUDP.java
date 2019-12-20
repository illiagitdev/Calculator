package lesson19_12_19.java.main.client.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {
    private static final int PORT = 1641;

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        DatagramPacket packet = new DatagramPacket(new byte[1024], 124, InetAddress.getLocalHost(), PORT);
        packet.setData("Hello to UDP server".getBytes());
        socket.send(packet);
    }
}