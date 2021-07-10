
import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        System.out.println("Client connected");

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

        while (true) {
            String dataDiterima = dataInputStream.readUTF();
            System.out.println("Client: " + dataDiterima);
            if (dataDiterima.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}