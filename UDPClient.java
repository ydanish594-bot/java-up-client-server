import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {

        // Create UDP socket
        DatagramSocket clientSocket = new DatagramSocket(5001);

        byte[] buffer = new byte[1024];

        System.out.println("UDP Client started...");
        System.out.println("Waiting for messages from server...");

        while (true) {

            // Create datagram packet for receiving data
            DatagramPacket packet =
                    new DatagramPacket(buffer, buffer.length);

            // Receive packet
            clientSocket.receive(packet);

            // Convert received data to String
            String message =
                    new String(packet.getData(), 0, packet.getLength());

            // Display message
            System.out.println("Server: " + message);

            // Exit condition
            if (message.equalsIgnoreCase("exit")) {
                break;
            }
        }

        clientSocket.close();
    }
}