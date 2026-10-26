# Java UDP Client-Server Communication

## About
A simple Java networking project that demonstrates communication between a UDP server and a UDP client using `DatagramSocket` and `DatagramPacket`.

## Features
- Sends messages from server to client.
- Uses UDP networking protocol.
- Supports multiple messages in one session.
- Stops communication when the server sends `exit`.

## Technologies Used
- Java
- Java Networking API
- UDP Protocol
- IntelliJ IDEA

## Project Structure
```text
java-udp-client-server/
├── UDPServer.java
├── UDPClient.java
└── README.md
```

## How to Run

### 1. Compile the programs
```bash
javac UDPServer.java UDPClient.java
```

### 2. Start the client
```bash
java UDPClient
```

### 3. Start the server in another terminal
```bash
java UDPServer
```

Type messages in the server terminal. They will appear in the client terminal. Type `exit` to stop both programs.

## Concepts Learned
- UDP communication
- Client-server architecture
- Java socket programming
- Sending and receiving datagrams

## Author
Yasin Danish
