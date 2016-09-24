import java.io.InputStream;
import java.io.PrintStream;
import java.io.IOException;

public class lab3{

    public static void main(String[] args){

        InputStream in = System.in;
        PrintStream out = System.out;
        try {
            int x = in.read();
            while (x != -1){
                out.write(x);
                x = in.read();
            }
        }catch (IOException e){
            System.out.println("IOException"); return;
        }
        
    }
}
