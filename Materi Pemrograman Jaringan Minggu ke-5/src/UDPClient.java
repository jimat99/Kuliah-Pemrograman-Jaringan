
import java.io.*;
import java.net.*;

public class UDPClient {

    public static void main(String[] args) throws Exception {
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress ipAddress = InetAddress.getByName("localhost");
        byte inData[] = new byte[1024];
        byte outData[] = new byte[1024];
        String str = userInput.readLine();
        outData = str.getBytes();
        DatagramPacket packet1 = new DatagramPacket(outData, outData.length, ipAddress, 1234);
        clientSocket.send(packet1);
        DatagramPacket packet4 = new DatagramPacket(inData, inData.length);
        clientSocket.receive(packet4);
        String receiveStr = new String(packet4.getData());
        System.out.println(receiveStr);
        clientSocket.close();
    }
}
