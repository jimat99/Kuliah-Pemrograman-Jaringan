
import java.io.*;
import java.net.*;

public class UDPServerModif {

    public static void main(String[] args) throws IOException {
        DatagramSocket serverSocket = new DatagramSocket(1234);
        BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));
        InetAddress ipAddress = InetAddress.getByName("localhost");
        byte outData[] = new byte[1024];
        byte inData[] = new byte[1024];

        while (true) {
            DatagramPacket packet2 = new DatagramPacket(inData, inData.length);
            serverSocket.receive(packet2);
            String str = new String(packet2.getData());
            System.out.println(str);

            InetAddress ipAddress2 = packet2.getAddress();
            int port = packet2.getPort();
            String sendStr = serverInput.readLine();
            outData = sendStr.getBytes();
            DatagramPacket packet3 = new DatagramPacket(outData, outData.length, ipAddress2, port);
            serverSocket.send(packet3);
        }
    }
}
