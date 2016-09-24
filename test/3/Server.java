import java.net.*;
import java.io.*;
import java.util.*;

public class Server {

    public static void main(String [] args){
        try {
            int port = Integer.parseInt(args[0]);
            ServerSocket serverSocket = new ServerSocket(port);
            System.err.println("listening on port " + port);
            Socket socket = serverSocket.accept();
            System.err.println("connection accepted");
            new ReadWriteThread(System.in,socket.getOutputStream(),
                                "").start();
            new ReadWriteThread(socket.getInputStream(), System.out,
                                "").start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
