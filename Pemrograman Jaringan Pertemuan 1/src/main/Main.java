package main;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("Local Host Address: " + addr.getHostAddress());
        String hostName = addr.getHostName();
        System.out.println("Local Host Name: " + hostName);
    }
}
