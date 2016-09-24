import java.net.*;
import java.io.*;
import java.util.*;

public class Client{

    public static void main(String [] args){
        try {
            int port = Integer.parseInt(args[0]);
            Socket socket = new Socket(args[1],port);
            System.err.println("connected on port " + port);
            new ReadWriteThread(System.in,socket.getOutputStream(),
                                "").start();
            new ReadWriteThread(socket.getInputStream(),System.out,
                                "").start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
