
import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 80);

        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String dataDikirim = bufferedReader.readLine();
            dataOutputStream.writeUTF(dataDikirim);
            if (dataDikirim.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}
