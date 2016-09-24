import java.io.*;
import java.util.*;

public class Caesar {

    public static void main(String[] args){
        int shift = 0;
        if (args.length >0){
            try{
                shift = Integer.parseInt(args[0]);
            }catch (NumberFormatException e){
                System.err.println("Argument not an int");
            }
        }
        InputStream in = System.in;
        PrintStream out = System.out;
        try {
            int b = in.read();
            while (b != -1){
                b+= shift;
                out.write(b%255);
                b = in.read();
            }
            out.close();
        }catch (IOException e){
            System.err.print("IOException");
        }
    }
}
