

import java.net.*;
import java.io.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {

        // Create UDP socket
        DatagramSocket serverSocket = new DatagramSocket(5000);

        InetAddress clientAddress = InetAddress.getByName("localhost");
        int clientPort = 5001;

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("UDP Server started...");
        System.out.println("Type messages to send to the client:");

        while (true) {
            // Read message from server console
            String message = br.readLine();

            // Convert message to bytes
            byte[] data = message.getBytes();

            // Create datagram packet
            DatagramPacket packet = new DatagramPacket(
                    data,
                    data.length,
                    clientAddress,
                    clientPort
            );

            // Send packet to client
            serverSocket.send(packet);

            // Exit condition
            if (message.equalsIgnoreCase("exit")) {
                break;
            }
        }
        serverSocket.close();
    }
}

