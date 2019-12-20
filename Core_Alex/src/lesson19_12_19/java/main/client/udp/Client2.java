package lesson19_12_19.java.main.client.udp;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client2 {
    private static final int PORT = 1641;
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        DatagramPacket packet = new DatagramPacket(new byte[1024],124, InetAddress.getLocalHost(), PORT);
        packet.setData();
        
        socket.receive(packet);
//        System.out.println(new String(packet.getData()));
        System.out.println("Send the message!");
        socket.send(new DatagramPacket(new byte[1024],112));

    }
}
