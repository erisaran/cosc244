import java.io.InputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lab3q2{

    public static void main(String[] args){

        InputStream in = System.in;
        PrintStream out = System.out;
        InputStreamReader i = new InputStreamReader(in);
        BufferedReader b = new BufferedReader(i);
        try {
            StringBuilder s = new StringBuilder(b.readLine());
            s.reverse();
            String st = s.toString();
            out.println(st);
        }catch (IOException e){
            System.out.println("IOException"); return;
        }
        
    }
}
